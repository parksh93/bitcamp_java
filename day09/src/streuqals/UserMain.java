package streuqals;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		/*
		 *  같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		 *  String 객체를 생성할 시 같은 주소값을 공유한다
		 */
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1 == s2);		
		
		Scanner sc = new Scanner(System.in);
		User u = new User("1234");
		System.out.println("비밀번호를 입력하세요");
		String password = sc.next(); //new String()으로 만드는 것과 같은 원리로 새로 할당
									// 그렇기 때문에 "1234"를 입력하더라도 17번 라인의 "1234" 와는 주소가 다르게 할당 된다
		
		//if (password == u.pw) { //두 주소가 다르기 때문에 false가 나온다
		if (password.equals(u.pw)) { //주소가 아닌 문자를 비교하기 때문에 true가 나온다
			System.out.println("비밀번호가 일치합니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
}
