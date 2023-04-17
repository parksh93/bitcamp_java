package day07;

public class CatMain {
	
	public static class Cat {
		public String name;
		public int age;
		public String variety;
		public int weight;
		
	}
	
	public static void showCatInfo(Cat cat) {
		System.out.println("고양이 이름 : " + cat.name);
		System.out.println("고양이 나이 : " + cat.age);
		System.out.println("고양이 품종 : " + cat.variety);
		System.out.println("고양이 몸무게 : " + cat.weight);
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat(); //Cat이라는 사설 자료형 만들었다 볼 수 있다.
		
		c1.name = "누구";
		c1.age = 5;
		c1.variety = "길고양이";
		c1.weight = 12;
		
		showCatInfo(c1);
		
		//c2,c3를 새롭게 생성
		//이 고영이들도 showInfo로 조회
		//c1, c2, c3 메모리 구조 전개도 그리기
		Cat c2 = new Cat(); //Cat이라는 사설 자료형 만들었다 볼 수 있다.
		
		c2.name = "별이";
		c2.age = 10;
		c2.variety = "먼치킨";
		c2.weight = 10;
		
		showCatInfo(c2);
		
		Cat c3 = new Cat(); //Cat이라는 사설 자료형 만들었다 볼 수 있다.
		
		c3.name = "떼껄룩";
		c3.age = 2;
		c3.variety = "점박이";
		c3.weight = 8;
		
		showCatInfo(c3);
		

		
	}
}
