package day05;

public class ForStarQuiz3_2 {
	public static void main(String[] args) {
		//for문과 if문을 활용해 별찍
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i < 5-j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
