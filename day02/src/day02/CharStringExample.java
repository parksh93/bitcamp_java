package day02;

public class CharStringExample {
	public static void main(String[] args) {
		//※스택은 하나의 값만 저장하는 규칙이 있다
		
		//문자형(기본형 변수-스택에 직접저장)
		char c1 = 'a'; //2byte
		char c2 = 97; //문자는 숫자와 교환가능, ascii code상 65는 A, 66은 B(65~90까지가 대문자/97부터 소문자 a) / +32 => 소문자로 변경
		
		/*
		 * 한글 '가'를 유니코드로 표현할때는 AC00인데
		 * 직접 코드값을 char에 저장할때는 탈출문자 \(역슬래시)u를 왼쪽에 붙인다
		 */
		char c3 = '\uAC00';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//문자열(참조형 변수-힙에 저장, 스택에는 주소만)
		String s1 = "my dream";
		String s2 = "is a developer";
		System.out.println("--------------------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+" "+s2);
		
	}
}
