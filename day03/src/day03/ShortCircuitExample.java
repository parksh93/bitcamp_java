package day03;

public class ShortCircuitExample {
	public static void main(String[] args) {
		//전체연산자(&, |): 모든결과 확인 > 연산효율 떨어지므로 일반적인 상황에서는 잘 사용X
		System.out.println(false & (3/1==0));
		System.out.println(true | (3/1==0));
		
		System.out.println("---------------------");
		
		//단축연산자(&&, ||): 앞에 결과에서 해당 조건을 만족하거나 불만족시 종료 
		System.out.println(false && (3/1==0));
		
	//	System.out.println(true | (3/0==1));	//에러
		System.out.println(true || (3/0==1));	//0 나누기는 에러지만 앞에 true로 만족하여 해당 코드 종료했기때문에 에러X
	}
}
