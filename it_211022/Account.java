package gui;

public class Account {
	
	private String ano;
	private String owner;
	private long balance;
	
	public Account(String ano, String owner, long bal) {
		this.ano = ano;
		this.owner = owner;
		this.balance = bal;
	}
	
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getAno() {
		return ano;
	}
	
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	
	public void setBalance(long bal) {
		this.balance = bal;
	}
	
	public long getBalance() {
		return balance;
	}
}
