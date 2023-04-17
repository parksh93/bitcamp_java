package day03;

import java.util.Scanner;

public class SwithExample2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 번호로 입력해주세요");
		System.out.println("1. 카페라떼\n2. 아메리카노\n3. 녹차프라프치노");
		int order = sc.nextInt();
		
		switch (order) {
		case 1:
			System.out.println("주문하신 카페라떼 나왔습니다.");
			break;
		case 2:
			System.out.println("주문하신 아메리카노 나왔습니다.");
			break;
		case 3:
			System.out.println("주문하신 녹차프라프치노 나왔습니다.");
			break;
		}
	}
}
