package begin;

public class MySecond {
	public static void main(String[] aaa) {
		int a = 10;
		int b = 4;
		int c = a/b;
		double d = a/b;
		double e = (double)a/(double)b;
		
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		
		Operator o = new Operator();
		o.logicalOper();
		o.a();
	}
}
