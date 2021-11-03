package ex;

public class ArrayInArrayExample {
	
	public static void main(String[] args) {
		 
		int[][] mathScores = new int[2][3]; 
		for(int i=0 ; i<mathScores.length ; i++) {	//배열의 행의 숫자 증가
			for(int j=0 ; j<mathScores.length ; j++) { //배열의 열의 숫자 증가
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0 ; i<englishScores.length ; i++) {
			for(int j=0 ; j<englishScores.length ; j++) {
				System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95,80}, {92, 96, 80} };
		for(int i=0 ; i<javaScores.length ; i++) {
			for(int j=0 ; j<javaScores.length ; j++) {
				System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j] );
			}
		}
	}
}
