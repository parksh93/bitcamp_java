package example.encap.bad;

public class MainClass {
	public static void main(String[] args) {
		MyBirthday b = new MyBirthday();
		
		b.year = 2023;
		b.month = 13;
		b.day = 32;
		
		b.showDateInfo(); 
	}
}
