package begin;

public class Control {
	
	public String if1() {
		String r = "";
		int su = 10;
		
		if(su>1) {
			r = "su�� 1���� ŭ";
		}
		return r;
	}
	
	public String if2(int x, int y) {
		String str = "ū����";
		if(x>y) {
			str += x;
		}else {
			str += y;
		}
		
		return str;
	}
	
	// if~else if
	// �Ǽ��� ������ �Ű������� ���޹޾� ������ �����ϴ� �޼���
	public String if3(double a) {
		if(a>=4.5) {
			System.out.println("A+");
		}else if(a>=4.0) {
			System.out.println("A");
		}else if(a>=3.5) {
			System.out.println("B+");
		}else if(a>=3.0) {
			System.out.println("B");
		}else if(a>=2.5){
			System.out.println("C+");
		}else if(a>=2.0){
			System.out.println("C");
		}else if(a>=1.5){
			System.out.println("D+");
		}else if(a>=1.0){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		return "";
	}
	
	//�����ε� = �ߺ������� �� (double ��� float�� ����Ͽ���.)
	/*public String if3(float a) {
	
	}*/

	/*switch ��
	 * ���� ����� ���ڷ� ���޹޾� �Ʒ��� ���� ����ǰ�� ����
	 * a or A : ��Ź��
	 * b or B : ȭ����
	 * c or C : ���
	 */
	public String testSwitch(char c) {
		
		String str = "����ǰ��";
		
		switch(c) {
		 case 'A' : 
		 case 'a' : str += "��Ź��";	break;
		 	
		 case 'B' : 
		 case 'b' : str += "ȭ����";	break;
		 	
		 case 'C' : 
		 case 'c' : str += "���";	break;
		}
		return str;
	}
	
	/* 
	 * for
	 * �ΰ��� ���� x,y�� ���޹޾� x~y������ Ȧ���� ���� 
	 * ����Ͽ� �����ϴ� �޼��带 �ۼ��Ͻÿ�.
	 */
	public int forHap(int x, int y) {
		int hap = 0;
		
		for(int i=x ; i<=y ; i++) {
			if(i%2==1) {
				hap += i;
			}
		}
		return hap;
	}
	
	/*
	 *	while
	 *	������ �Ű������� ���޹޾� �������� �ش��ϴ� ��������
	 *	���ڿ��� ����� ��ȯ�Ͻÿ�.
	 */
	public String testWhile(int dan) {
		String str = "";
		int i = 1; //���� ����
		int r = 0; //���� ���
		
		long start = System.currentTimeMillis(); //����ð�
		long end = 0;
		
		while(i<99999) {
			r = dan * i;
			str += String.format("%d * %d = %d\n", dan, i, r);
			i++;
		}
		end = System.currentTimeMillis(); //�����ð�
		
		System.out.println(end-start);
		
		return str;
	}
	
	public String testWhile2(int dan) {

	//�Ű����� ���� �����̸� �޼��带 �����Ͻÿ�
	public String testDoWhile(boolean b) {
		String str = "�����";
		
		do {
			System.out.println("run...");
		}while(b);
		
		return str;
	}
		String str = "";
		StringBuffer sb = new StringBuffer();
		int i = 1; //���� ����
		int r = 0; //���� ���
		
		long start = System.currentTimeMillis();
		long end = 0;
		
		while(i<10) {
			r = dan * i;
			sb.append( String.format("%d * %d = %d\n", dan, i, r) );
			i++;
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		return sb.toString();
	}
}