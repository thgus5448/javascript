package begin;

import java.sql.Date;
import java.util.Calendar;

public class EnumTest {
	
	//������
	public EnumTest() {
		Week today;
		today = Week.FRIDAY;
		//Date d = new Date();
		//System.out.println(d.getDate());
		
		Calendar c = Calendar.getInstance();
		
		int year	= c.get(Calendar.YEAR);
		int month	= c.get(Calendar.MONTH) + 1;
		int day		= c.get(Calendar.DAY_OF_MONTH);
		int week	= c.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d�� %d�� %d��(%d) \n", 
				year, month, day, week);
		
		
		//�ú���
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		switch(week) {
		case 1: today = Week.SUNDAY;
			break;
		case 2: today = Week.MONDAY;
			break;
		case 3: today = Week.TUESDAY;
			break;
		case 4: today = Week.WENSDAY;
			break;
		case 5: today = Week.THUSDAY;
			break;
		case 6: today = Week.FRIDAY;
			break;
		case 7: today = Week.SATURTDAY;
			break;
		}
		
		System.out.printf("%d:%d:%d \n", hour, minute, second);
	}
	
	public static void main(String[] args) {
		EnumTest et = new EnumTest();
	}
}
