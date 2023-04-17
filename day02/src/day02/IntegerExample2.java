package day02;

public class IntegerExample2 {

	public static void main(String[] args) {
		byte a  = 127;
		short b = 32767;
		int c = 2147483647;		//int 최대값
		long d = 2147483648L;	//int의 최대값을 넘는 수 표현시 숫자 뒤에 L을 붙인다 이유:매직넘버의 디폴트는 int이기 때문에
		
		System.out.println(d);
		
		//2진수 저장시에는 매직넘버 앞에 접두어 0b를 붙인다.
		int bin = 0b1010;	//binal
		System.out.println(bin); //10진수로 변형되어 나옴
		
		//8진수 저장시애는 정수앞에 접두어로 0을 붙인다
		int oct = 064;	//octal
		System.out.println(oct);
		
		//16진수 저장시에 정수 앞에 접두어  0x를 붙인다
		int hex = 0x3a4c;	//hexadecimal
		System.out.println(hex);
		
	}
}
