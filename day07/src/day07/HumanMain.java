package day07;

public class HumanMain {
	public static void main(String[] args) {
		//타 클래스에 정의된 요소를 main내부에서 생성해 쓸 수 있다
		
		//new 키워드는 힙에 자료를 저장
		//new 키워드의 리턴자료는 해당 힙의 주소
		//구조체의 인스턴스를 생성
		Human h1 = new Human();
		h1.name = "박상현";
		h1.age = 23;
		h1.height = 180;

		System.out.println("사람1의 이름 : " + h1.name);
		
		Human h2 = new Human();
		h1.name = "유재석";
		h1.age = 26;
		h1.height = 178;
		
		System.out.println("사람2의 키 : " + h2.height);
		
		
	}
}
