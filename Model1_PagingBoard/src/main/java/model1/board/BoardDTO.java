package model1.board;

/* DTD(Data Transfer Object)
 * 주로 데이터의 저장이나 전송에 사용되는 로직을 가지고 있지 않은 객체
 */
public class BoardDTO {

	/* 멤버 변수 선언 board의 테이블과 동일하게 작성 
	 * - 자바빈즈 규약에 따라 접근 지정자를 private로 지정
	 * - 자료형은 특별한 이유가 없다면 String으로 지정
	 */
	private String num;
	private String title;
	private String content;
	private String id;
	private java.sql.Date postdate;	//작성일
	private String visitcount;
	private String name; 
	/* private String name; 
	 * board테이블 : 작성자의 아이디만 저장 = 목촉 출력 시 이름을 출력할 수 없다.
	 * 그렇다면 이름을 출력하기 위해선 어떻게 하여야 하는가?
	 * member테이블과 board 테이블 join(조인)사용
	 */
	
	
	/* Getter & Setter : 객체의 무결성을 보장하기 위해 사용
	 * 예) 외부에서 몸무게라는 필드에 직접 접근 = 0보다 낮은 값을 줄 수도 있음
	 * 이 경우 객체의 무결성이 깨진다. 이를 방지하기 위해 Getter/Setter를 사용하여 데이터의 무결성을 지켜준다.
	 */
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public java.sql.Date getPostdate() {
		return postdate;
	}
	public void setPostdate(java.sql.Date postdate) {
		this.postdate = postdate;
	}
	public String getVisitcount() {
		return visitcount;
	}
	public void setVisitcount(String visitcount) {
		this.visitcount = visitcount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
