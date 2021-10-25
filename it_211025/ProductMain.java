package basic_api;

public class ProductMain {
		
		public static void main(String[] args) {
			Product p1 = new Product("a001", "TV" , 100 , 2000);
			Product p2 = new Product("a001", "TV" , 50, 1500);
			Product p3 = new Product("b001", "냉장고", 100, 1000);
			
			System.out.println(p1); //제품 정보 표시(모든 필드값 출력)
			System.out.println(p1.equals(p2)); //같은 제품
			System.out.println(p1.equals(p3)); //다른 제품
		}
}
