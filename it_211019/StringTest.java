package begin;

public class StringTest {
	/* ������
	 * 1) Ŭ������� ����
	 * 2) ��ȯ��(void) ��� ����.
	 * 3) ���� �����ڰ� ������� ������ ����ӽ��� 
	 * �Ű������� ���� �����ڸ� ������
	 * (=�����ڴ� ������ �����ϴ�)
	 * 
	 * �������� ��Ȱ��?
	 * 1) ��ü�� ������ �� ����ϴ� �޼���
	 * 2) Ŭ������ �ʱ�ȭ�ϴ� ��Ȱ
	 */
	public StringTest() {
		String s1 = "abc";
		String s2 = "abc";
		
		//���ڿ��� == �� ���ϴ� ���
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		//���ڿ��� equals()�� ���ϴ� ���
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
