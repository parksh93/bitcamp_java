package day08;

public class BasketballPlayerMain {
	public static void main(String[] args) {
		BasketballPlayer b1 = new BasketballPlayer("강백호", 185, 21, 10000);
		
//		b1.name = "강백호";
//		b1.age = 21;
//		b1.heigt = 185;
//		b1.salary = 500000;
		
		BasketballPlayer b2 = new BasketballPlayer("김종규", 200, 23, 99999);
		
//		b2.name = "김종규";
//		b2.age = 23;
//		b2.heigt = 200;
//		b2.salary = 999999;
		
		b1.showInfo();
		b1.dunkShoot();
		System.out.println("---------------------");
		b2.showInfo();
		b2.dunkShoot();
	}
}
