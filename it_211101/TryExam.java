package except;

public class TryExam {
	
	public void try1() {
			
			try {
				for(int i=5 ; i>=0; i--) {
					double d = 10/i;
					System.out.println(d);
				}
				
			}catch(ArithmeticException ex) {
				//������ ���� ��ġ����
				System.out.println("������� �߻�");
			}finally {
				System.out.println("������ ����");
			}
		
		System.out.println("���α׷� ���� ����");
	}
	
	
	public void try2() throws ArithmeticException{
		
	}
	
	
	public void try3() {
		try {
			int a = 10/4;
			throw new ArithmeticException();
		}catch(ArithmeticException ex) {
			System.out.println("������ ���ܰ� �߻���");
		}
	}	
}
