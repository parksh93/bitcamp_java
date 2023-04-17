package day05;

import java.util.Scanner;

public class ForStarQuiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i+1 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
