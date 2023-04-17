package day04;

public class EnhancedForExample {
	public static void main(String[] args) {
		String [] weekday = {"일", "월", "화","수","목","금","토"};
		
		for (String day : weekday) { //foreach: 외부에서 받아오는 데이터를 처리할때 그 데이터가 몇개인지 모를때 사용
			System.out.println(day + "요일");
		}
	}
}
