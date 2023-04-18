package exception.runtime;

public class NullPointerExample {
	public static void main(String[] args) {
		String str = null;
//		str = "Hello";
		
		//toLowerCase : 모든 문자열 소문자로 변환
		//toUpperCase : 모든 문자열 대문자로 변환
		System.out.println(str.toUpperCase());
	}
}
