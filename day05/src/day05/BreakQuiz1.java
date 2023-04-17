package day05;

import java.util.Scanner;

public class BreakQuiz1 {
	public static void main(String[] args) {
		//1. 난수 발생 (1~10) 2개
		//2. while문 무한루프, 위에서 발생된 난수 두개를 곱한 답은? 이라 질문해서 문제 출제
		//3. if문으로 비교해 정답시 break 오답시 오답입니다 라는 멘트와 함께 답을 재입력
		
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		
		Scanner sc =  new Scanner(System.in);
		
		while (true) {
			System.out.print(a + " X " + b + " = ");
			int result = sc.nextInt();
			if(a * b == result) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("오답입니다.\n");
			}
		}
		sc.close();
	}
}
