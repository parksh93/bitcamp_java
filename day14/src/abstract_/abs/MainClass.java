package abstract_.abs;

public class MainClass {
	public static void main(String[] args) {
		//PopupStore 객체 생성 불가
		//PopupStore ps = new PopupStore();
		
		PopupStore s = new Store();
		
		s.orderApple();
		s.orderOrange();
		s.orderGrape();
		s.test();
		s.refund();
	}
}
