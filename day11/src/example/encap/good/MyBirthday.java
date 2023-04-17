package example.encap.good;

public class MyBirthday {
	//은닉화시 변수 private
	private int year;
	private int month;
	private int day;
	
	public MyBirthday(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
	}
	//getter, setter메서드로 멤버변수에 접근
	
	//setter : 은닉변수에 값은 저장
	//getter :  값을 조회만 할 수 있고 변경이 불가능하기 때문에 직접조회보다 보안성이 높음

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			this.month = 1;
		}else {
			this.month = month;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day < 1 || day > 31) {
			day = 1;
		}else {
			this.day = day;
		}
	}
	
	
	
	
}
