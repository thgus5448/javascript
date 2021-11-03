package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {
	String driver = "com.mysql.cj.jdbc.Driver";
	String path = "jdbc:mysql://locallhost:3306/mysql";
	String user = "root";
	String pwd = "1111";
	
	public JDBCTest() {
		try {
			/*
			 * 1) ����̹��� �޸𸮿� �ε�(Class.forName())
			 * 2) connection�� ����
			 * 3) CRUD ����
			 */
			Class.forName(driver);
			System.out.println("driver loading...ok");
			
			Connection conn = DriverManager.getConnection(path, user, pwd);
			System.out.println("connection.....ok");
			
			/*
			 * select : statement -> excuteQuery -> ResultSet(select������ ������)
			 * insert, update, delete : statement -> excuteUpdate -> int(������ ����� ���)
			 */
			String sql = "select * from guestbook";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("mid") + " : " 
									+ rs.getString("dco") );
			}
			
			//------insert--------------
			sql = "insert into gusetbook(mid, mdate.doc. pwd) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "root");
			ps.setString(2, "2021-11-02");
			ps.setString(3, "jdbc�� ���� insert ��");
			ps.setString(4, "1111");
			
			int rCnt = ps.executeUpdate();
			if(rCnt>0) {
				System.out.println("�����Ͱ� ���������� insert ��");
			}else {
				System.out.println("������ ���� �߻�");
			}
			
			//-----update-----------------
			//sql = "update guestbook set doc="hi..."where num=32";
			ps = conn.prepareStatement(sql);
			rCnt = ps.executeUpdate();
			
			//-----delete-----------------
			//sql = "delete from guestbook where num=32"
			ps = conn.prepareStatement(sql);
			rCnt = ps.executeUpdate();
					
			rs.close();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new JDBCTest();
	}
}
