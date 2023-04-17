package example.overload;

public class MainClass {
	public static void main(String[] args) {
		OverloadExample oe  = new OverloadExample();
		
		oe.input(1);
		oe.input(1, 2);
		oe.input("가나다", 3.5);
		oe.input("가나다");
		oe.input(3.4, "가나다");
	}
}
