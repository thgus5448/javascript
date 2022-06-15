package Class_abstract;

//추상 클래스 : Phone의 생성자를 호출해서 객체를 생성할 수 없음을 보여주는 클래스
public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();	//Phone 클래스는 추상클래스이기 때문에 new 연산자로 객체를 만들지 못함.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");	//SmartPhone 클래스는 실체 클래스이기 때문에 new 연산자로 객체 생성 가능.
		
		//Phone의 메소드 : 추상 클래스인 Phone의 클래스는 사용할 수 있다.
		smartPhone.turnOn();
		smartPhone.InternetSearch();
		smartPhone.turnOff();
	}
}
