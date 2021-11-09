package ex;

import java.util.Scanner;

public class Exercise09 {
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println(" 1.학생수  | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("----------------------------------------------");
			System.out.print("선택 > ");
			
			int SelectNo = scanner.nextInt(); //콘솔에 입력된 숫자를 읽고 리턴
			
			if(SelectNo == 1) {
				
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if(SelectNo == 2) {
				
				if(studentNum == 0 ) {
					System.out.println("학생수가 입력되지 않았습니다.");
				}
				
				for(int i=0; i<studentNum ; i++) {
					System.out.print("scores["+i+"] > ");
					int score = scanner.nextInt();
					scores[i] = score;
				}
				
			} else if(SelectNo == 3) {
				
				
				if(studentNum == 0 ) { 
					System.out.println("학생수가 입력되지 않았습니다.");
				}
					
				if(scores == null) {
					System.out.println("학생들의 점수가 입력되지 않았습니다.");
				}
				
				
				for(int i=0 ; i<studentNum ; i++) {
					System.out.println("scores["+i+"] > " +scores[i]);
				}
				
			} else if(SelectNo == 4) {
				
				if(studentNum == 0) { 
					System.out.println("학생수가 입력되지 않았습니다.");
				} else if(scores == null) {
					System.out.println("학생들의 점수가 입력되지 않았습니다.");
				}
				
				//최고점수
				int best = 0;
				for(int i=0 ; i<scores.length ; i++) {
					if(scores[i] > best) {
						best = scores[i];
					}
				}
				
				//평균점수
				int sum = 0; //합
				double avg = 0.0; //평균점수
				for(int i=0 ; i<scores.length ; i++) {
					sum += scores[i];
					avg = (double)sum/scores.length;
				}
				
				System.out.println("최고 점수 : " +best);
				System.out.println("평균 점수 : " +avg);
				
			} else if(SelectNo == 5) {
				run = false;
			}
		}
	}
}
