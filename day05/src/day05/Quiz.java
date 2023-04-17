package day05;

public class Quiz {
	public static void main(String[] args) {
		//4x + 5y = 60의 양수 해를 모두 구하시오
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if ((4*i + 5*j) == 60) {
					System.out.println("x : " + i);
					System.out.println("y : " + j);
				}
			}
		}
	}
}
                                                                     