package basic_api;

public class ProductMain {
		
		public static void main(String[] args) {
			Product p1 = new Product("a001", "TV" , 100 , 2000);
			Product p2 = new Product("a001", "TV" , 50, 1500);
			Product p3 = new Product("b001", "�����", 100, 1000);
			
			System.out.println(p1); //��ǰ ���� ǥ��(��� �ʵ尪 ���)
			System.out.println(p1.equals(p2)); //���� ��ǰ
			System.out.println(p1.equals(p3)); //�ٸ� ��ǰ
		}
}
