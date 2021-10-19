package begin;

public class StringTest {
	/* 생성자
	 * 1) 클래스명과 동일
	 * 2) 반환값(void) 기술 안함.
	 * 3) 만약 생성자가 기술되지 않으면 가상머신이 
	 * 매개변수가 없는 생성자를 빌려줌
	 * (=생성자는 생략이 가능하다)
	 * 
	 * 생성자의 역활은?
	 * 1) 객체가 생성될 때 사용하는 메서드
	 * 2) 클래스를 초기화하는 역활
	 */
	public StringTest() {
		String s1 = "abc";
		String s2 = "abc";
		
		//문자열을 == 로 비교하는 방법
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		//문자열을 equals()로 비교하는 방법
		if( s1.equals(s2) ) {
			System.out.println("s1.equals(s2)");
		}else {
			System.out.println("not s1.equals(s2)");
		}
	}
	
	public static void main(String[] args) {
		StringTest st = new StringTest();
	}
}
