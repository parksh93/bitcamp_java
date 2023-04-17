package day04;

import java.util.Scanner;

public class SwithExample {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			System.out.println("직급을 입력하세요");
			System.out.println("[사원,대리,과장,차장,부장]");
			String j = sc.next();
			switch (j) {
			case "사원":
				System.out.println("사원의 월급은 200만원입니다.");
				break;
			case "대리":
				System.out.println("대리의 월급은 300만원입니다.");
				break;
			case "과장":
				System.out.println("과장의 월급은 400만원입니다.");
				break;
			case "차장":
				System.out.println("차장의 월급은 500만원입니다.");
				break;
			case "부장":
				System.out.println("부장의 월급은 600만원입니다.");
				break;
				
			default:
				System.out.println(j+"은(는) 없는 직급입니다."
						+ "\n직급을 다시 입력해주세요.");
				continue;
			}
			break;
		}
		
		
		
	}
}
