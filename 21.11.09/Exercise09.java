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
			System.out.println(" 1.�л���  | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("----------------------------------------------");
			System.out.print("���� > ");
			
			int SelectNo = scanner.nextInt(); //�ֿܼ� �Էµ� ���ڸ� �а� ����
			
			if(SelectNo == 1) {
				
				System.out.print("�л��� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if(SelectNo == 2) {
				
				if(studentNum == 0 ) {
					System.out.println("�л����� �Էµ��� �ʾҽ��ϴ�.");
				}
				
				for(int i=0; i<studentNum ; i++) {
					System.out.print("scores["+i+"] > ");
					int score = scanner.nextInt();
					scores[i] = score;
				}
				
			} else if(SelectNo == 3) {
				
				
				if(studentNum == 0 ) { 
					System.out.println("�л����� �Էµ��� �ʾҽ��ϴ�.");
				}
					
				if(scores == null) {
					System.out.println("�л����� ������ �Էµ��� �ʾҽ��ϴ�.");
				}
				
				
				for(int i=0 ; i<studentNum ; i++) {
					System.out.println("scores["+i+"] > " +scores[i]);
				}
				
			} else if(SelectNo == 4) {
				
				if(studentNum == 0) { 
					System.out.println("�л����� �Էµ��� �ʾҽ��ϴ�.");
				} else if(scores == null) {
					System.out.println("�л����� ������ �Էµ��� �ʾҽ��ϴ�.");
				}
				
				//�ְ�����
				int best = 0;
				for(int i=0 ; i<scores.length ; i++) {
					if(scores[i] > best) {
						best = scores[i];
					}
				}
				
				//�������
				int sum = 0; //��
				double avg = 0.0; //�������
				for(int i=0 ; i<scores.length ; i++) {
					sum += scores[i];
					avg = (double)sum/scores.length;
				}
				
				System.out.println("�ְ� ���� : " +best);
				System.out.println("��� ���� : " +avg);
				
			} else if(SelectNo == 5) {
				run = false;
			}
		}
	}
}
