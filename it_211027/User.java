package thread;

import gui.Account;

public class User extends Thread{
	Bank b;
	int amt;
	
	public User(Bank b, int amt) {
		this.b = b;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		Bank b = new Bank();
		for(int i=0 ; i<5 ; i++) {
			int r =b.withdraw(amt);
			
			System.out.println(r);
		}
	}
}
