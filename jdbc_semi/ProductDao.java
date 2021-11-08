package jdbc_semi;
/* �ڡڡڡڡ� PreparedStatement() �ڡڡڡڡڡ�
 * - statementŬ������ ��� ���
 * - ���ڿ� ���õ� �۾��� Ưȭ(�Ű�����)
 * - �ڵ� ������ ����, ������ ����.
 * - �ڵ差�� ���� -> �Ű������� set������ϱ� ������
 * - �ؽ�Ʈsqlȣ��
 * 
 * �ڡڡڡڡڡ� PreparedStatementŬ������ sql �ڡڡڡڡڡ�
 * �Ű����� �� ���� + �Ű����� ��ȿȭ ó��.
 * ��) ps.setInt(1, no);
 */

/* �ڡڡڡڡ� rs.next() �ڡڡڡڡ�
 * ResultSetŬ������ ���Ǵ� �޼ҵ��� �� ����
 * ���� ������ ������ġ�� �̵��� ��, �� ���ҵ�(row)�� ����Ų��.
 * true : ���� ���� ���� / false : ���� ���� ����
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import db.DBConn;


//��Ʈ�� Ŭ����. ���� CRUD ó��
public class ProductDao implements ProductInter{
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	
	//������
	public ProductDao() {
		conn = new DBConn().getConn(); //�����ͺ��̽��� �����ϱ�
	}
	
	
	//������ ����
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
	
	//������ ������Ʈ
	public boolean update(ProductVo vo) {
		boolean r = false;
		String sql = "UPDATE products set ea=? mdate=? WHERE num=?";
		
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getEa()); //�Ѿ�
			ps.setString(2, vo.getMdate()); //��¥
			ps.setInt(3, vo.getNum()); //����
			
		
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
	
	
	//������ ����
	public boolean delete(ProductVo vo) {
		boolean r = false;
		String sql = "DELETE FROM productes WHERE num=? and code=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getNum());
			int rCnt = ps.executeUpdate();
			
			if(rCnt>0) { //������Ʈ�Ȱ������� 
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

	
	//�˻�
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
			ps = conn.prepareStatement(sql); //DBȣ�� ��ɾ�
			ps.setString(1, code);
			rs = ps.executeQuery();
			
			if( rs.next() ) {
				vo.setCode(code);
				vo.setCodeName(rs.getString("codeName"));
				vo.setPrice(rs.getInt("price"));
				ProductMain.status.setText(code + "�۾������� ����1");
			} else {
				ProductMain.status.setText("�۾������� ����2");
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
	
