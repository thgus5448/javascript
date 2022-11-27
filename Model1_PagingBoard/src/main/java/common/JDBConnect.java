package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContext;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

// 생성 목적 : JDBC 드라이버를 이용하여 DB와의 연결을 관리하는 클래스
public class JDBConnect {
	//멤버 변수
	public Connection con;	// Connection : 데이터베이스와 연결 담당
	public Statement stmt;	//Statement : 인파라미터가 없는 정적 쿼리문을 실행할 때 사용
	public PreparedStatement psmt;	//PreparedStatement : 인파라미터가 있는 동적 쿼리문을 실행할 때 사용
	/* 인파라미터?
	 * 쿼리문 작성 시 매개변수로 전달된 값을 설정할 때 사용 ?(물음표)로 표현한다.
	 */
	public ResultSet rs;	//SELECT 쿼리문의 결과를 저장할 때 사용
	
	// 생성자1 : 접속 정보를 하드코딩한 생성자
	// 단점 : 서버 이전 등의 이유로 접속 정보가 변경되는 경우 클래스를 수정한 후 다시 컴파일해야 하는 불편함이 있다.
	public JDBConnect() {
		try {
			// JDBC 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	//[jdbc:oracle:thin](오라클 프로토콜):@localhost(호스트명):1521(포트번호):xe(sid)
			String id = "ydh";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB연결 성공(생성자1)");
			
		}catch (Exception e) {
			e.printStackTrace();
			/* e.printStackTrace()
			 * - 예외 발생 당시의 호출스택(Call stack)에 있던 메소드의 정보와 예외 결과를 화면에 출력함
			 * - 예외 상황을 분석하기 위한 용도로 사용(개발자에게 디버깅 할 수 있는 힌트를 제공)
			 */
		}
	}

	// 생성자2(오버로딩) : 접속 정보를 외부(web.xml)로부터 받는 생성자
	// 단점 : DB 접속이 필요할 때마다 동일한 코드를 JSP에서 반복해서 기술하여야 한다.
	public JDBConnect(String driver, String url, String id, String pwd) {
		try {
			// JDBC 드라이버 로드
			Class.forName(driver);
			
			// DB에 연결
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB 연결 성공(생성자2)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//생성자3
	public JDBConnect(ServletContext application) {
		try {
			//JDBC 드라이버 로드
			String driver = application.getInitParameter("OracleDriver");
			Class.forName(driver);
			
			//DB에 연결
			String url = application.getInitParameter("OracleURL");
			String id = application.getInitParameter("OracleId");
			String pwd = application.getInitParameter("OraclePwd");
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB 연결 성공(생성자3)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결 해제
	public void close() {
		try {
			//if문을 이용해 사용된 적 있는 객체들만 자원 해제
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(psmt != null) psmt.close();
			if(con != null) con.close();
			
			System.out.println("JDBC 자원 해제");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
