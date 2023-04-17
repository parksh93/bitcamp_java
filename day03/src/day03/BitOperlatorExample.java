package day03;

public class BitOperlatorExample {
	public static void main(String[] args) {
		/*
		 * 비트연산자 사용처: 대형프로젝트에서 속도를 향상시키기 위해서
		 */
		
		byte a = 5;	//00000101
		byte b = 3; //00000011
		
		// 비트곱(&) : 둘 다 1일때만 1
		System.out.println(a & b);	//00000001
		
		// 비트합(|) : 둘중 하나만 1이여도 1
		System.out.println(a | b);	//00000111
		
		// 베타적논리합(xor, ^) : 같으면 0, 다르면 1
		System.out.println(a ^ b);	//00000110
		
		// 비트이동연산자(<<, >>) : 앞으로 밀면 한칸당 2배, 뒤로 밀면 한칸당 1/2
		System.out.println(a << 4);	//00000101 > 01010000
		byte c = 48; //0011000
		System.out.println(c >> 3);
	}
}
