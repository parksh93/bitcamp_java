package day05;

import java.util.Scanner;

public class ForStarQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sNum = sc.nextInt();
		sc.close();
		
		for (int i = sNum; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
