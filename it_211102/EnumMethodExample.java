package ex;

//열거 객체의 메소드
public class EnumMethodExample {
	public static void main(String[] args) {
		//name() 메소드 - 열거 객체가 가지고있는 문자열 리턴
		Week today = Week.SUNDAY;
		String name = today.name();
		
		//ordinal() 메소드 - 열거 객체 중 몇번째 열거 객체인지 알려줌
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드 - 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENESDAY;
		int result1 = day1.compareTo(day2); //day2가 기준
		int result2 = day2.compareTo(day1); //day1이 기준
		
		//valueOf() 메소드 - 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말입니다.");
			} else {
				System.out.println("평일입니다.");
			}
		}
		
		//values() 메소드 - 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}
}
