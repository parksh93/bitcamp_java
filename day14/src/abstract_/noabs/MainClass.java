package abstract_.noabs;

public class MainClass {
	public static void main(String[] args) {
		//abstract 미사용시 문제점
		
		//1.상속 목적으로 만든 팝업스토어 생성 가능
		PopupStore ps = new PopupStore();
		
		//2. 오버라이딘 강요가 되지 않아 오버라이딩이 필요한 메서드 누락
		Store s = new Store();
		s.orderApple();
		s.orderOrange();
		s.orderGrape();	//포도주스 정보 갱신 누락
	}
}
