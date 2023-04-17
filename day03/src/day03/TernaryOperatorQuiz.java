package day03;

public class TernaryOperatorQuiz {
	public static void main(String[] args) {
		//난수 발생 명령어 Math.ramdom() 0보다 크고 1보다 작은 난수 가져다 줌
		int randomNumber = (int)(Math.random() * 10);

		//삼항연산자를 이용해서 난수로 얻은 값이 7보다 크면 당첨, 7이하면 낙첨이라는 문자를 result에 저장하게 해 주세요
		//저장된 result는 콘솔창에 결과를 볼 수 있도록 출력해주세요
		String result = (randomNumber  > 7 ? "당첨" : "낙첨");
		
		System.out.println(result);
		System.out.println("난수: "+randomNumber);
		
	}
}
