package ClassTest;

public class CalculatorExample {
	
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		
		/* �Ű����� Ÿ��(type)�� �Ű� ������ Ÿ��(int)�� �޶� byteŸ���� intŸ������ 
		 * �ڵ� Ÿ�� ��ȯ�Ǳ� ������ ������ ������ ������ �ʴ´� */
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result1 : " + result2);
		
		myCalc.powerOff();
	}
}
