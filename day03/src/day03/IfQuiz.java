package day03;

import java.util.Scanner;

public class IfQuiz {
	public static void main(String[] args) {

		/*
		 * 정수를 입력했을때 음수라면 "음수입니다.", 양수라면 "양수입니다" 0이라면 "0입니다."라고 출력하는 구문을 만들어주세요 단, 양수인
		 * 경우 짝수 홀수를 구분해서 짝수라면 "짝수 양수입니다.", "홀수 양수입니다" 라고 출력하도록 구분하세요
		 */
		Scanner sc = new Scanner(System.in);
		int number = 0;

		while (true) {
			System.out.print("입력 (종료: 99): ");
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				if (number == 99) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println(number);


				if (number > 0) {
					if (number % 2 == 1) {
						System.out.println("홀수 양수입니다.");
					} else {
						System.out.println("짝수 양수입니다.");
					}
				} else {
					System.out.println("0입니다.");
				}
			} else{
				String input = sc.next();
				System.out.println("음수입니다.");
			}
		}
		sc.close();
	}
}
