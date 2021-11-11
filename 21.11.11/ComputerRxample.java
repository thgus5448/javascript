package ClassTest;

//매개변수의 수를 모를 경우
public class ComputerRxample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result : " + result1);
		
		int result2 = myCom.sum2( new int[] {1, 2, 3, 4, 5} );
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);
	}
}
