package ex;

public class Exercise08 {
	
	//����08) �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���غ�����(��ø for���� �̿��ϼ���.)
	public static void main(String[] args) {
		int[][] array = {
				{95, 36},
				{92, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0; //��
		double avg = 0.0; //��հ�
		int count = 0; //�հ踦 ���� ��
		
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum/count;
		
		System.out.println("sum :" + sum);
		System.out.println("avg :" + avg);
	}
}
