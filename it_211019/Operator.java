package begin;

public class Operator {
	
	//논리연산자의 연산 기능 생략 테스트
	//접근제한자 반환형 메서명(매개변수들){...}
	public void logicalOper() {
		int a=10;
		int b=10;
		
		if( (++a)>100 && (++b)>100 ) {
			System.out.println("a=" + a);
			System.out.println("b=" + b);
		}else {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
		}
	}
	
	public static void main(String[] bbb) {
		Operator kkk = new Operator();
		kkk.logicalOper();
		kkk.a();
	}
}
