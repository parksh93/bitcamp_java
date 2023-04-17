package day03;

import java.util.Scanner;

public class ScannerExaple {
	public static void main(String[] args) {
		//프로그램 실행 후 사용자에게 입력받음
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		
		System.out.println(name);
		
		sc.close();
	}
}
