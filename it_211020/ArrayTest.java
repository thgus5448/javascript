package begin;

public class ArrayTest {
	//1���� �迭�� ������ �� ���� �Է��ϰ�, �Էµ� ���� ���
	public void arr1() {
		int score[] = new int[5];
		score[0] = 90;
		score[1] = 80;
		score[2] = 95;
		score[3] = 65;
		score[4] = 55;
		
		for(int i=0 ; i<score.length ; i++) {
			System.out.println(score[i]);
		}
		
		//�ִ밪
		int max = score[0];
		
		for(int i=0 ; i<=score.length ; i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
		
		System.out.println("�ִ� : " + max);
	}
	
	
	public void arr2() {
		String[][] info = new String[5][3];
		String[][] names = null;
		names = new String[5][3];
		
		info[0][0] = "park";
		info[0][1] = "3491";
		info[0][2] = "����";
		
		info[1][0] = "�达";
		info[1][1] = "1234";
		info[1][2] = "����";
	}
	
	public void arr3() {
		Score[] scores = new Score[5];
		
		scores[0] = new Score();
		scores[0].mid = "park";
		
		scores[1] = new Score();
		scores[1].mid = "hong";
		
		System.out.println(scores[0].mid);
		
		//����° �迭�� Score�� ������ �� mid, subject,
		//score, exam ������ ���� �� ���
		scores[2] = new Score();
		scores[2].mid = "Yu";
		scores[2].subject = "�ڹ�";
		scores[2].score = "99";
		scores[2].exam = "ȣ�ѷѷ�";
		
		System.out.println("mid : " + scores[2].mid);
		System.out.println("subject" + scores[2].subject);
		System.out.println("score" + scores[2].score);
		System.out.println("exam" + scores[2].exam);
		
		Score s = scores[2];
		System.out.println("------------");
		System.out.println("mid : " + s.mid);
		System.out.println("score : " + s.score);
		System.out.println("exam : " + s.exam);
		
	}
	
	// System.arratcopy�� ����Ͽ� �迭 ����
	public void arr4() {
		String[] oldStr = {"java", "array", "copy"};
		String[] newStr = new String[5];
		
		//arraycopy : �迭�����ϱ� (�����ҹ迭�̸�, �����ҹ迭���°����, �ٿ������迭�̸�,
		System.arraycopy(oldStr, 0, newStr, 1, 2);
		for(String s : newStr) {
			System.out.println(s);
		}
	}
}
