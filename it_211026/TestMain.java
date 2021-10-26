package basic_api;

public class TestMain {
	
	public static void name() {
		Data d = new Data();
		
		int hc = d.hashCode();
		String info = d.toString();
		Data cloneD = (Data)d.clone();
		
		
		System.out.println("hash Code : " +hc);
		System.out.println("toString : " + info);
		System.out.println(d);
		
		//equals test
		System.out.println("equals text......");
		Score s1 = new Score("a001", 100);
		Score s2 = new Score("a001", 100);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
