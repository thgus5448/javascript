package thread;

public class BankTest {
	
	public static void main(String[] args) {
		Bank b = new Bank();
		User son = new User(b,300);
		User son2 = new User(b,300);
		
		son.start();
		son2.start();
	}
}
