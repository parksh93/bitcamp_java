package abstract_.abs;

public abstract class PopupStore {
	public abstract void orderApple();
	
	public abstract void orderOrange();

	public abstract void orderGrape(); 
	
	public void test() {
		System.out.println("test");
	}
	
	public final void refund() {
		System.out.println("제품에 문제가 있어 환불합니다.");
	}
	
}
