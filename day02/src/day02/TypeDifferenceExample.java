package day02;

public class TypeDifferenceExample {
	public static void main(String[] args) {
		
		//정수와 실수간 연산은 언뜻 보기에는 당연히 진행이 될것 같지만
		// 실제로는 저장받는 자료형에 따라 다른 결과가 나온다
		
		//정수 + 실수를 정수에 저장하는 경우 연산 불가 => 비트 구조가 다르기 때문에
		//*실수의 구조 음/양 자릿수 수
		//int result = 1 + 2.5; 에러
		
		//정수 + 실수를 실수에 저장하는 경우 가능
		double result2 = 1 + 2.5;
		
		
		
	}
}
