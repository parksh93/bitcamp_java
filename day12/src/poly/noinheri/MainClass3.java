package poly.noinheri;

public class MainClass3 {
	public static void main(String[] args) {
		Rat rt1 = new Rat();
		Rat rt2 = new Rat();
		
		Warrior w1 = new Warrior("coco");
		
		w1.showStatus();
		
		w1.huntRat(rt1);
		System.out.println();
		w1.huntRat(rt1);
		
		w1.showStatus();
		w1.huntRat(rt1);
	}
}
