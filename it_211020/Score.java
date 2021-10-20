package begin;

public class Score {
	String mid;
	String subject;
	double score;
	String exam;
	
	/*
	 * setter
	 * 1) set으로 시작함.
	 * 2) 필드의 첫글자는 대소문자가 바뀜.
	 * 3) 반환형은 무조건 void
	 * 4) 매개변수는 반드시 필드의 유형
	 */
	
	public void setMid(String s) {
		this.mid = s;
	}
}
