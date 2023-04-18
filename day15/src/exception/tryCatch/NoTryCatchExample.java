package exception.tryCatch;

import java.util.Scanner;

public class NoTryCatchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int prevValue = sc.nextInt();
		int nextValue = sc.nextInt();
		
		if (nextValue != 0) {
			System.out.println(prevValue / nextValue);
		}else {
			System.out.println("0을 나누는 값으로 넣을 수 없습니다.");
		}
		
		sc.close();
	}
}
