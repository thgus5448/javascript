package except;

public class TestMain {
	public static void main(String[] args) {
		TryExam te = new TryExam();
		te.try1();
		
		try {
			te.try2();
		}catch(ArithmeticException ex) {
			System.out.println("throws���� ���޵� ���ܹ߻�");
		}
	}
}
