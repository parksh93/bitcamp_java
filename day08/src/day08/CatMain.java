package day08;

public class CatMain {
	public static void main(String[] args) {
		Cat cat1 = new Cat("어완자", 5, "러시안 블루", "화이트");
		
//		cat1.name = "어완자";
//		cat1.age = 5;
//		cat1.kind = "러시안블루";
//		cat1.color = "화이트";

		Cat cat2 = new Cat("룰루", 6, "먼치킨", "턱시도");
		
		
//		cat2.name = "룰루";
//		cat2.age = 6;
//		cat2.kind = "먼치킨";
//		cat2.color = "턱시도";
		
		cat1.showCatInfo();
		System.out.println();
		cat2.showCatInfo();
	}
}
