package db;

import java.sql.*;
import java.util.*;

import com.mysql.cj.xdevapi.Result;

public class GuestBookDao {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	public GuestBookDao() {
		conn = new DBConn().getConn();
	}
	
		
	public Vector<Vector> search(String find){
		Vector<Vector> list = new Vector<Vector>();
		String sql = "select * from guestbook where doc like '%?%' ";
		try {
			ps.getConnection().prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Vector<String> v = new Vector<String>();
				v.add(rs.getInt("num")+"");
				v.add(rs.getString("mid") );
				v.add(rs.getString("doc") );
				v.add(rs.getString("mdate") );
				
				list.add(v);
			}
		}catch(SQLException e){
			 e.printStackTrace();
		}
		return list;
		
		public boolean insert(GuestBookVo vo) {
			boolean r = false;
			String sql = "insert into guestbook(mid, mdate, doc, pwd) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getMid());
			ps.setString(2, vo.getMdate());
			ps.setString(3, vo.getDoc());
			ps.setString(4, vo.getPwd());
			
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				r = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return r;
		}
		
		public boolean update(GuestBookVo vo) {
			boolean r = false;
			String sql = "update guestbook set mid=?, doc=?, mdate=? where num=? and pwd=?";
			try {
				conn.setAutoCommit(false);
				ps = conn.prepareSttement(sql);
				ps.setString(1, vo.getMid());
				ps.setString(2, vo.getDoc());
				ps.setString(3, vo.getMdate());
				ps.setString(4, vo.getNum());
				ps.setShort(4, vo.getPwd);
				
				int rCnt = ps.executeUpdate();
				if(rCnt>0) {
					r=true;
					conn.commit();
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
			return r;
		}
		
		public boolean delete(GuestBookVo vo) {
			boolean r = false;
			String sql = "delete from guestbook where num=? and pwd=?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, vo.getPwd());
				ps.setString(2, vo.getPwd());
				int rCnt = ps.executeUpdate();
				if(rCnt>0) {
					r=true;
					conn.commit();
				} else {
					conn.commit();
				}
				
				conn.rollback();
			}
			
			return r;
		}
	}
		
}
