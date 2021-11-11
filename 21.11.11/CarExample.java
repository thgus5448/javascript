package ClassTest;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		
		//Car myCar =new Car(); 
		//기본 생성자를 호출할 수 없다. 
		//왜?  Car클래스에 생성자 선언이 있기 때문에 Car(String color, int cc)를 호출해서 객체를 생성해야함
	}

}
