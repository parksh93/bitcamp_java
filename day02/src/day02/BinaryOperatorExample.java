package day02;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		// 산술연산자(+, -, *, /, %)
		int i = 7 / 3; // 정수 나누기 정수의 결과는 무조건 정수여야 한다
		int j = 7 % 3; // 나머지는 정수 최대몫을 구하고 남는 숫자만 구한다

		System.out.println("7/3 몫: " + i);
		System.out.println("7/3 나머지: " + j);

		// 비교연산자(<, >, >=, <=, ==, !=)
		System.out.println(i > j);
		System.out.println(20 == 19);

	}
}
