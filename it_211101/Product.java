package Collect;

public class Product {
	private String code;
	private String codeName;
	private int ea;	
	private int price;
	
	public Product(String code, String cn, int ea, int price) {
		this.code = code;
		this.codeName = cn;
		this.ea = ea;
		this.price = price;
	}
	
	//code와 codeName이 동일하면 같은 객체 hashCode();
	@Override
	public int hashCode() {
		int r = 0;
		r = code.hashCode() + codeName.hashCode();
		
		return r;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean r = false;
		
		if(o instanceof Product) {
			Product p = (Product)o;
			r = code.equals( p.getCode() ) && 
				codeName.equals( p.getCodeName() );
		}
		
		return r;
	}
	
	
	//code와 codeName ea price amt가 출력되도록 toString();
	@Override
	public String toString() {
		String r = null;
		r = String.format("%10s%20s%5d%8d%10d", 
						code,codeName, ea, price, (ea*price) );
		
		return r;
	}

	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	