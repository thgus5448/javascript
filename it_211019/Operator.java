package begin;

public class Operator {
	
	//���������� ���� ��� ���� �׽�Ʈ
	//���������� ��ȯ�� �޼���(�Ű�������){...}
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
