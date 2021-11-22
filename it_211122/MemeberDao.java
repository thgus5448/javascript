package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import bean.DBConn;

public class MemeberDao {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	Page page;
	
	public MemberDao() {
		try {
			conn = new DBConn().getConn();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<MemberVo> select(String n, String f){
		List<MemberVo> list = new ArrayList<MemberVo>();
			try {
				//toSize
				sql = " select count(mid toSize from memeber "
					+ " where mid=? or phone like ? "
					+ "or address like ? or address3 like ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, f);
				ps.setString(2, "%" + f + "%");
				ps.setString(3, "%" + f + "%");
				ps.setString(4, "%" + f + "%");
				
				rs = ps.executeQuery();
				if(rs.next()) {
					int totSize = rs.getInt("toSize");
					page = new Page(toString, nowPage);
				}
				
				//MemberVo
				
			} catch (Exception ex) {
				ex.printStackTrace();
		}
		return list;
	}
	
	
}
