package day06;

public class BreakExample2 {
	public static void main(String[] args) {
		/*
		 * 내부 반복문에서 break를 사용하여 바깥쪽 반복문까지
		 * 한번에 종효시키고 싶다면 외부 반복문에 label을 붙입니다.
		 * 
		 */
		
		//outer라는 이름의 label을 외부반복무에 붙이기
		outer : for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + ", " + j);
				if (i == 2 && j == 3) {
					break outer;
				}
			}
		}
	}
}
