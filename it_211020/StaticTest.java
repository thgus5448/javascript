package begin;

public class StaticTest {
	
	//인스턴스형 변수 - 객체를 생성한 후에야 하용할 수 있는 변수
	int instanceType = 100;
	static int staticType = 200;
	
	//static : 객체화 되기도 전에 메모리에 올라가는 변수
	public static void kkk() {
		System.out.println(instanceType);
		System.out.println(staticType);
	}
	
	//static이있으면 메모리에 먼저 올라감 - 만들어지기 전,후 둘다 사용가능
	public static void main(String[] args) {
		System.out.println(StaticTest.staticType);
		System.out.println(StaticTest.instanceType);
	}
}
