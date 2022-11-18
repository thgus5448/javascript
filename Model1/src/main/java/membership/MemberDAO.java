package membership;

import common.JDBConnect;

public class MemberDAO extends JDBConnect{
	// 명시한 데이터베이스로의 연결이 완료된 MemberDAO 객체 생성
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);	//부모 클래스의 생성자를 가져옴
	}
	
	// 명시한 아이디&패스워드와 일치하는 회원 정보를 반환.
	public MemberDTO getMemberDTO(String uid, String upass) {
		MemberDTO dto = new MemberDTO();	// 회원 정보 DTO 객체 생성
		String query = "SELECT * FROM member WHERE id=? AND PASS=?";
		
		try {
			// 쿼리 실행
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			rs = psmt.executeQuery();
			
			// 결과 처리
			if(rs.next()) {
				// 쿼리 결과로 얻은 회원 정보를 DTO 객체에 저장
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegisdate(rs.getString(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;	// dto 객체 반환
	}
}
