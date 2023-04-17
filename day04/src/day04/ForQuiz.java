package day04;

public class ForQuiz {
	public static void main(String[] args) {
		//랜덤 구구단
		//구구단의 범위는 1부터 9까지
		//난수로 얻은 값에 1 ~ 9로 곱한값을 for문을 이용해 콘솔에 찍어주세요
		int ranNum = (int)(Math.random() * 9);
		for (int i = 1; i <= 9; i++) {
			System.out.println((ranNum + 1) * i);
		}
	}
}
