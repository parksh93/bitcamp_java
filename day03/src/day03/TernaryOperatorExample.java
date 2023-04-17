package day03;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		//삼항연산자(조건식 ? 결과1 : 결과2) > 조건이 참이면 결과1, 거짓이면 결과2
		int heigt = 180;
		
		String result = (heigt <= 130 ? "무료입장" : "유료입장");
		
		System.out.println(result);
		
		
	}
}
