package api.util.calendar;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal =  Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	//1월이 0부터 시작
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);	//일요일이 숫자 1
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY: strWeek = "월";break;
		case Calendar.TUESDAY: strWeek = "화";break;
		case Calendar.WEDNESDAY: strWeek = "수";break;
		case Calendar.THURSDAY: strWeek = "목";break;
		case Calendar.FRIDAY: strWeek = "금";break;
		case Calendar.SATURDAY: strWeek = "토";break;
		case Calendar.SUNDAY: strWeek = "일";break;
		default : strWeek = "일"; break;
		}
		System.out.println(strWeek);
	}
}
