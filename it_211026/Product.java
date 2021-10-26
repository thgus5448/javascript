package basic_api;

public class Product {
	
	String pid; //��ǰ�ڵ�
	String pName; //��ǰ�̸�
	int ea; //����
	int price; //����
	int amt; //�ѱݾ�
	
	
	//������
	public Product(String pid, String pName, int ea, int price) {
		this.pid = pid;
		this.pName = pName;
		this.ea = ea;
		this.price = price;
	}
	
	@Override
	public String toString() {
		//toString() : int������ string������ ��ȯ�ϱ� ���ؼ� ���
		
		amt = ea * price;
		String str = String.format("��ǰ�� : %s, ��ǰ �ڵ� : %s, ���� : %d, �ܰ� : %d, �ѱݾ� : %d",
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


