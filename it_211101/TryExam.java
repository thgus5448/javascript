package except;

public class TryExam {
	
	public void try1() {
			
			try {
				for(int i=5 ; i>=0; i--) {
					double d = 10/i;
					System.out.println(d);
				}
				
			}catch(ArithmeticException ex) {
				//오류에 따른 조치내용
				System.out.println("연산오류 발생");
			}finally {
				System.out.println("무조건 실행");
			}
		
		System.out.println("프로그램 정상 종료");
	}
	
	
	public void try2() throws ArithmeticException{
		
	}
	
	
	public void try3() {
		try {
			int a = 10/4;
			throw new ArithmeticException();
		}catch(ArithmeticException ex) {
			System.out.println("강제로 예외가 발생굄");
		}
	}	
}
