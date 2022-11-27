package membership;

public class MemberDTO {
	// 멤버 변수 선언
	private String id;			// 아이디
	private String pass;		// 비밀번호
	private String name;		// 이름
	private String regisdate;	// 가입날짜
	
	// 멤버 변수별 getter & setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegisdate() {
		return regisdate;
	}
	public void setRegisdate(String regisdate) {
		this.regisdate = regisdate;
	}
}
