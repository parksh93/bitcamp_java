package poly.inheri;


public class MainClass1 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior("coco");
		Magician m1 = new Magician("modu");
		
		Rabbit rb = new Rabbit();
		Rat rt = new Rat();
		
		w1.showStatus();
		while (rb.getHp() > 0) {
			w1.hunt(rb);
		}
		w1.hunt(rb);
		w1.showStatus();
		
		while (rt.getHp() > 0) {
			w1.hunt(rt);
		}
		w1.hunt(rt);
		w1.showStatus();
		System.out.println("--------------end warrior---------------");
				
		Rabbit rb2 = new Rabbit();
		Rat rt2 = new Rat();
		m1.showStatus();
		m1.hunt(rb2);
		m1.castFireball(rb2);
		m1.showStatus();
		
		m1.castFireball(rt2);
		m1.hunt(rt2);
		m1.hunt(rt2);
		m1.showStatus();
	}
}
