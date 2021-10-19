package begin;

public class Exam04 {
	public void ex4() {
		int x = 0;
		int y = 0;
		
		while( (x+y) !=5 ) {
			x = (int)(Math.random()*6)+1;
			y = (int)(Math.random()*6)+1;
			System.out.printf("(%d, %d)\n", x, y);
		}
	}
	
	public void ex5() {
		//4x+5y=60
		for(int x=1 ; x<=10 ; x++) {
			for(int y=1 ; y<=10 ; y++) {
				if( (4*x) + (5*y) == 60) {
					System.out.printf("(%d, %d)", x, y);
				}
			}
		}
	}
}
