package thread;

public class Bank {
	int account = 1000; //�����ڿ�
	
	public int deposit(int amt) {
		account += amt;
		return account;
	}
	
	public int withdraw(int amt) {
		synchronized (this) {
			
			if(account>=amt) {
				try {
					Thread.sleep(10);
				}catch(Exception ex) {
					account -= amt;
				}
			}
			
			return account;
		}
	}
}
