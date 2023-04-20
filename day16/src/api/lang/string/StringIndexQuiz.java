package api.lang.string;

import java.util.Scanner;

public class StringIndexQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String s = sc.next();
		
		System.out.println("조회할 단어를 적으세요");
		String sel = sc.next();
		
		int cnt = 0;
	
		for (int i = 0; i < s.length(); i++) {
			if(s.indexOf(sel, i) != s.indexOf(sel, i+1)) {
				System.out.println("단어 감지 인덱스: " + s.indexOf(sel,i));
				cnt++;
			}
		}
		
		System.out.println("총 단어 수 : " + cnt);
		sc.close();
	}
}
