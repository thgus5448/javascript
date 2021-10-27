package thread;

public class DemonThread {
	public static void main(String[] args) {
		DemonThread dt = new DemonThread();
		dt.start();
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
	}
}
