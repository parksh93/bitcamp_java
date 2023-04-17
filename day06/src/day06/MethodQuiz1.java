package day06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MethodQuiz1 {
	public static void star(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void menuChoice() {
		int ranNum = (int) (Math.random() * 5) + 1;

		switch (ranNum) {
		case 1:
			System.out.println("오늘은 초밥 어떠신가요?\n");
			break;
		case 2:
			System.out.println("오늘은 제육덮밥 어떠신가요?\n");
			break;
		case 3:
			System.out.println("오늘은 돈까스 어떠신가요?\n");
			break;
		case 4:
			System.out.println("오늘은 샌드위치 어떠신가요?\n");
			break;
		case 5:
			System.out.println("오늘은 모밀 어떠신가요?\n");
			break;
		}
	}

	public static void selectYear(String a, int b) {
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		Date d = new Date();

		String y = year.format(d);

		int re = Integer.parseInt(y) - b;

		System.out.println(a + "님이 태어난 년도는 " + re + "입니다.\n");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		exit : while (true) {
			System.out.println("1. 별찍기 \n2. 메뉴 추천\n3. 내가 태어난 년도는?\n4. 종료");
			System.out.println("-----------------------");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("원하는 층수를 입력하세요");
				int starFloor = sc.nextInt();
				star(starFloor);
				break;
			case 2:
				menuChoice();
				break;
			case 3:
				System.out.print("성함 : ");
				String name = sc.next();
				System.out.print("만나이 : ");
				int age = sc.nextInt();
				selectYear(name, age);
				break;
			case 4: break exit;
			default:
				System.out.println("없는 번호입니다.\n");
				break;
			}
		}
		System.out.println("종료합니다.");
		sc.close();
	}
}
