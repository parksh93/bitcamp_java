package poly.noinheri;

public class MainClass2 {
	public static void main(String[] args) {
		Rabbit rb1 = new Rabbit();
		Rabbit rb2 = new Rabbit();
		
		Warrior w1 = new Warrior("coco");
		
		w1.huntRabbit(rb2);
		
		w1.showStatus();
	}
}
