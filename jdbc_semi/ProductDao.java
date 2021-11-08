package jdbc_semi;
/* ★★★★★ PreparedStatement() ★★★★★★
 * - statement클래스의 기능 향상
 * - 인자와 관련된 작업이 특화(매개변수)
 * - 코드 안정성 높음, 가독성 높음.
 * - 코드량이 증가 -> 매개변수를 set해줘야하기 때문에
 * - 텍스트sql호출
 * 
 * ★★★★★★ PreparedStatement클래스의 sql ★★★★★★
 * 매개변수 값 대입 + 매개변수 유효화 처리.
 * 예) ps.setInt(1, no);
 */

/* ★★★★★ rs.next() ★★★★★
 * ResultSet클래스에 사용되는 메소드의 한 종류
 * 다음 행으로 실행위치를 이동한 후, 한 레소드(row)를 가르킨다.
 * true : 다음 행이 있음 / false : 다음 행이 없음
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import db.DBConn;


//컨트롤 클래스. 각종 CRUD 처리
public class ProductDao implements ProductInter{
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	
	//생성자
	public ProductDao() {
		conn = new DBConn().getConn(); //데이터베이스와 연결하기
	}
	
	
	//데이터 저장
	public boolean insert(ProductVo vo) {
		boolean r = false;
		String sql = "INSERT INTO product(code, ea, mdate) values(?,?,?)";
		
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getCode());
			ps.setInt(2, vo.getEa());
			ps.setString(3, vo.getMdate());
			
			int cnt = ps.executeUpdate();
			if(cnt > 0) {
				r = true;
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			return r;
	}
	
	//데이터 업데이트
	public boolean update(ProductVo vo) {
		boolean r = false;
		String sql = "UPDATE products set ea=? mdate=? WHERE num=?";
		
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getEa()); //총액
			ps.setString(2, vo.getMdate()); //날짜
			ps.setInt(3, vo.getNum()); //숫자
			
		
			int rCnt = ps.executeUpdate();
			if(rCnt > 0) {
				r = true;
				conn.commit();
			} else {
				conn.rollback();
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return r;
	}
	
	
	//데이터 삭제
	public boolean delete(ProductVo vo) {
		boolean r = false;
		String sql = "DELETE FROM productes WHERE num=? and code=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getNum());
			int rCnt = ps.executeUpdate();
			
			if(rCnt>0) { //업데이트된게있으면 
				r = true;
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch(SQLException e) {
			e.printStackTrace();	
		}
		return r;
	}

	
	//검색
	public Vector<Vector> search(String find) {
		Vector<Vector> list = new Vector<Vector>();
		String sql = "SELECT num, pro.code, codeName, price, ea, (ea*price) as amt F products pro JOIN parts par ON pro.code = par.code WHERE pro.code like ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			rs = ps.executeQuery();
				
			while(rs.next()) {
				Vector<String> v = new Vector<String>();
				
				v.add(rs.getInt("Number") + "");
				v.add(rs.getString("pro.code"));
				v.add(rs.getString("codeName"));
				v.add(rs.getInt("price") + "");
				v.add(rs.getString("ea"));
				v.add(rs.getString("amt"));
				list.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ProductVo selecProductVo(int num) {
		ProductVo vo = new ProductVo();
		String sql = "SELECT num, pro.code, codeName, price, ea, mdate From products pro JOIN par IN pro.coda = par.code WHERE num=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			
			if( rs.next() ) {
				vo.setNum(num);
				vo.setCode(rs.getString("pro.code"));
				vo.setCodeName(rs.getString("codeName"));
				vo.setPrice(rs.getInt("price"));
				vo.setMdate(rs.getString("mdate"));
				vo.setEa(rs.getInt("ea"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
	//code
	public ProductVo select(String code) {
		ProductVo vo = new ProductVo();
		String sql = "select * FROM parts WHERE code=?";
		
		try {
			ps = conn.prepareStatement(sql); //DB호출 명령어
			ps.setString(1, code);
			rs = ps.executeQuery();
			
			if( rs.next() ) {
				vo.setCode(code);
				vo.setCodeName(rs.getString("codeName"));
				vo.setPrice(rs.getInt("price"));
				ProductMain.status.setText(code + "글씨나오면 수정1");
			} else {
				ProductMain.status.setText("글씨나오면 수정2");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	//month
	public Vector<Vector> productMonth(int month) {
		Vector<Vector> list = new Vector<Vector>();
		String sql = "SELECT pro.code, codeName, price, ea, (ea*price) AS amt, MONTH(mdate) AS mo FROM products pro JOin parts par ON pro.code = par.code WHERE MONTH(mdate)=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, month);
			rs = ps.executeQuery();
			
			while( rs.next() ) {
				Vector<String> v = new Vector<String>();
				v.add(rs.getString("code"));
				v.add(rs.getString("codeName"));
				v.add(rs.getInt("ea") + "");
				v.add(rs.getInt("price") +"");
				v.add(rs.getInt("amt") + "");
				list.add(v);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public Vector<Vector> productParts(String parts) {
		Vector<Vector> list = new Vector<Vector>();
		String sql = "SELECT pro.code, codeName, price, ea, (ea*price) AS amt, month AS mon FROM products pro JOIN parts par ON pro.code WHERE pro.code=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, parts);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Vector<String> v = new Vector<String>();
				v.add(rs.getString("code"));
				v.add(rs.getString("codeName"));
				v.add(rs.getInt("ea")+"");
				v.add(rs.getInt("price")+"");
				v.add(rs.getInt("amt")+"");
				list.add(v);
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public ProductVo select(int serial) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
