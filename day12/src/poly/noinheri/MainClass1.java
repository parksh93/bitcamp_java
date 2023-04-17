package poly.noinheri;

public class MainClass1 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior("coco");
		Rabbit ra = new Rabbit();
		
		//정보 조회
		w1.showStatus();
		
		//토끼 사냥
		w1.huntRabbit(ra);
		
		//정보 조회
		w1.showStatus();
		
		//쥐 사냥
		//w1.huntRat();
		
		//정보 조회
		w1.showStatus();
	}
}
