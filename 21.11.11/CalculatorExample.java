package ClassTest;

public class CalculatorExample {
	
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		
		/* 매개값의 타입(type)과 매개 변수의 타입(int)이 달라도 byte타입은 int타입으로 
		 * 자동 타입 변환되기 때문에 컴파일 오류가 생기지 않는다 */
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result1 : " + result2);
		
		myCalc.powerOff();
	}
}
