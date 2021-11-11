package ClassTest;

// 매개 변수의 수를 모를 경우
public class Computer {
	
	//매개 변수가 몇개인지 모를 경우 매개변수를 배열로 선언해준다.
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0 ; i<values.length ; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length ; i++) {
			sum += values[i];
		}
		return sum;
	}
}
