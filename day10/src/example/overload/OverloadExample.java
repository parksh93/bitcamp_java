package example.overload;
/*
 *  오버로딩 	1. 이름과 리턴 자료형은 같아야함
 *  		2. 매개변수의 순서나 자료형이 달라야함
 *  		3. 같은 자료형도 개수가 다르면 허용
 * 
 */
public class OverloadExample {
	public void input(int a) {
		System.out.println("정수 1개 입력 받음");
	}
	
	//타입과 개수가 겹치면 안됨
//	public void input(int i) {
//		System.out.println("이름과 타입 다 같으면 불가");
//	}
	
	public void input(String a) {
		System.out.println("문자열 1개 입력 받음");
	}
	
	public void input(int a, int b) {
		System.out.println("정수 2개 입력받음");
	}
	
	public void input(String a, double d) {
		System.out.println("문자열 1개, 실수 1개 입력받음");
	}
	
	public void input(double d, String a) {
		System.out.println("문자열 1개, 실수 1개 입력받음");
	}
	
}
