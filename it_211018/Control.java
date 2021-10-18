package begin;

public class Control {
	
	public String if1() {
		String r = "";
		int su = 10;
		
		if(su>1) {
			r = "su는 1보다 큼";
		}
		return r;
	}
	
	
	public String if2(int x, int y) {
		String str = "큰수는";
		if(x>y) {
			str += x;
		}else {
			str += y;
		}
		
		return str;
	}
	
	// if~else if
	// 실수형 성적을 매개변수로 전달받아 학점을 리턴하는 메서드
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
}

//switch 문
/* 고객의 등급을 문자로 전달받아 아래와 같은 사은품을 리턴
 * a or A : 세탁기
 * b or B : 화장지
 * c or C : 라면
 */
public String testSwitch(char c) {
	
	String str = "사은품은";
	
	switch(c) {
	 case 'A' : 
	 case 'a' : str += "세탁기";	break;
	 	
	 case 'B' : 
	 case 'b' : str += "화장지";	break;
	 	
	 case 'C' : 
	 case 'c' : str += "라면";	break;
	}
	return str;
}

/* 
 * for
 * 두개의 정수 x,y를 전달받아 x~y까지의 홀수의 합을 
 * 계산하여 리턴하는 메서드를 작성하시오.
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
