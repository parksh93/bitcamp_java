package day03;

public class IfExample1 {
	public static void main(String[] args) {
		// 0~100까지의 int난수
		int score = (int) (Math.random() * 101); //n+1을 해줘야 n이 나옴
		System.out.println(score);

		if (score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		
	}
}
