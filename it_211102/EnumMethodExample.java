package ex;

//���� ��ü�� �޼ҵ�
public class EnumMethodExample {
	public static void main(String[] args) {
		//name() �޼ҵ� - ���� ��ü�� �������ִ� ���ڿ� ����
		Week today = Week.SUNDAY;
		String name = today.name();
		
		//ordinal() �޼ҵ� - ���� ��ü �� ���° ���� ��ü���� �˷���
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() �޼ҵ� - �Ű������� �־��� ���� ��ü�� �������� ���ķ� �� ��° ��ġ�ϴ���
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENESDAY;
		int result1 = day1.compareTo(day2); //day2�� ����
		int result2 = day2.compareTo(day1); //day1�� ����
		
		//valueOf() �޼ҵ� - �Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� ����
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		
		//values() �޼ҵ� - ���� Ÿ���� ��� ���� ��ü���� �迭�� ����� ����
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}
}
