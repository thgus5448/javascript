package begin;

public class StaticTest {
	
	//�ν��Ͻ��� ���� - ��ü�� ������ �Ŀ��� �Ͽ��� �� �ִ� ����
	int instanceType = 100;
	static int staticType = 200;
	
	//static : ��üȭ �Ǳ⵵ ���� �޸𸮿� �ö󰡴� ����
	public static void kkk() {
		System.out.println(instanceType);
		System.out.println(staticType);
	}
	
	//static�������� �޸𸮿� ���� �ö� - ��������� ��,�� �Ѵ� ��밡��
	public static void main(String[] args) {
		System.out.println(StaticTest.staticType);
		System.out.println(StaticTest.instanceType);
	}
}
