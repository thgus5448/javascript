package basic_api;

public class Product {
	
	String pid; //제품코드
	String pName; //제품이름
	int ea; //수량
	int price; //가격
	int amt; //총금액
	
	
	//생성자
	public Product(String pid, String pName, int ea, int price) {
		this.pid = pid;
		this.pName = pName;
		this.ea = ea;
		this.price = price;
	}
	
	@Override
	public String toString() {
		//toString() : int형에서 string형으로 변환하기 위해서 사용
		
		amt = ea * price;
		String str = String.format("제품명 : %s, 제품 코드 : %s, 수량 : %d, 단가 : %d, 총금액 : %d",
									pid, pName, ea, price, amt);
		
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		Boolean check = false;
		Product p = (Product)obj;
		
		if( p.pid.equals(this.pid) && p.pName.equals(this.pName)) {
			check = true;
		}
		return check;
	}
}


