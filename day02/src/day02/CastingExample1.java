package day02;

public class CastingExample1 {
	public static void main(String[] args) {
		/*
		 *  크기가 작은 데이터타입의 데이터를 큰 데이터타입으로
		 *  변환할때는 데이터타입을 자동으로 올려서(promotion/upcasting) 처리한다
		 */
		byte b = 10;
		int i = b; //byte -> int
		
		char c = '가';	//단일문자의 경우 숫자로 변환 가능
		int j = c; // char -> int
		System.out.println(j);
		
		int k = 500;
		double d = k; //int -> double
		System.out.println(d);
	}
}
