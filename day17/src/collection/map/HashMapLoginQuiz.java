package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========회원가입==========");
		System.out.println("ID와 PW를 입력하세요");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		System.out.println("==============================");
		System.out.println("로그인 해주세요");
		Map<String, String> user = new HashMap<>();
		
		user.put(id, pw);
		while (true) {
			System.out.print("ID : ");
			String loginId = sc.next();
			System.out.print("PW : ");
			String loginPw = sc.next();
			
			if (user.containsKey(loginId)) {
				if (user.containsValue(loginPw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("\n비밀번호가 일치하지 않습니다 다시 입력해 주세요");
				}
			}else {
				System.out.println("\n아이디가 존재하지 않습니다.");
				System.out.println("확인 후 다시 입력해주세요");
			}
			
		}
		sc.close();
		
	}
}
