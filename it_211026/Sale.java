package basic_api;

public class Sale implements Comparable<Sale>{

	private String pcode;
	private int amt;
	
	public Sale(String code, int amt) {
		this.pcode = code;
		this.amt = amt;
	}
	
	@Override
	public int compareTo(Sale o) {
		int r = 0;
		if(o == null) {
			r= -1;
		}else {
			r = this.amt - o.getAmt();
		}
		return r;
	}
	
	
	//pcode
	public String getPcode() {
		return pcode;
	}


	public void setPcode(String pcode) {
		this.pcode = pcode;
	}


	//amt
	public int getAmt() {
		return amt;
	}


	public void setAmt(int amt) {
		this.amt = amt;
	}
}
