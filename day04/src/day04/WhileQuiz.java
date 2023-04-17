package day04;

import java.util.Scanner;

public class WhileQuiz {
	public static void main(String[] args) {
		// 스무고개 수 맞추기

		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		System.out.println("숫자의 범위를 입력하세요(최저, 최대 순)");
		int minRange = sc.nextInt();
		int maxRange = sc.nextInt();

		while (true) {
			if (maxRange < minRange) {
				System.out.println("최소값보다 최대값이 더 작습니다. 다시 입력해주세요");
				minRange = sc.nextInt();
				maxRange = sc.nextInt();
			} else {
				break;
			}
		}
		// Math.random()이용
		int comValue = (int) (Math.random() * (maxRange - minRange + 1) + minRange);

		// 사용자에게 숫자를 입력받게 해주세요.
		System.out.println("------------------문제시작-------------------");

		while (true) {
			System.out.print("입력 : ");
			int userValue = sc.nextInt();
			if (userValue > maxRange || userValue < minRange) {
				System.out.println("설정하신 범위를 벗어났습니다.");
				System.out.println("다시 입력해주세요\n");
				++cnt;
			} else {
				// 불일치라면 업인지, 다운인지
				if (userValue > comValue) {
					System.out.println("다운입니다.\n");
					++cnt;
				} else if (userValue < comValue) {
					System.out.println("업입니다.\n");
					++cnt;
				} else {
					// 사용자에게 userValue 다시 입력 받기
					System.out.println("정답입니다.");
					System.out.println(cnt + "번 만에 맞추셨습니다.");
					break;
				}
			}
		}   
		sc.close();
	}
}
