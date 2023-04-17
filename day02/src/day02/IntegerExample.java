package day02;

public class IntegerExample {

	public static void main(String[] args) {
		
		int maxInt = 2147483647; //int 최대값 최대값이후에는 최저값부터 시작(overflow)
								//경계값 테스트
		
		System.out.println(maxInt + 10); 	// 01111111 11111111 1111111 11111111
											//+00000000 00000000 00000000 00001010
											// 1------- -------- -------- -------- => 음수로 표현됨
		
		int minInt = -2147483648; //int 최저값
		
		System.out.println(minInt - 1); //최저값 - 1 = 최대값
		
		
	}

}
