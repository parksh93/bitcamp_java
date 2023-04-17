package day03;

public class SwithExample1 {
	public static void main(String[] args) {
		String [] food = {"불고기","파스타","초밥","커리","케이크"};
		
		int idx = (int)(Math.random() * 5);
		
		switch (food[idx]) {
		case "초밥":
			System.out.println("일식입니다.");
			break;
		case "커리":
			System.out.println("인도식입니다.");
			break;
		case "불고기":
			System.out.println("한식입니다.");
			break;
		default:
			System.out.println("기타요리입니다.");
			break;
		}
	}
}
