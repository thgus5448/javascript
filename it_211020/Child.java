package begin;

public class Child extends Parent{
	
	/* 오버라이딩(=재정의)
	 public void myName() {
	 	System.out.println("안녕 나는 자식이야.");
	 }
	 */
	 
	 public static void main(String[] bbb) {
		 Child c = new Child();
		 c.myName();
		 System.out.println(c.PI);
	 }
}
