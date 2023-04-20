package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdate = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdate.format(date));
		
		SimpleDateFormat s = new SimpleDateFormat("오늘은 EEEE입니다. 오늘은 1년중 DD번째 날입니다.");
		System.out.println(s.format(date));
	}
}
