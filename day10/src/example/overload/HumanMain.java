package example.overload;

public class HumanMain {
	public static void main(String[] args) {
		Human h1 = new Human();
		
		h1.name = "김자바";
		h1.age = 21;
		
		Human h2 = new Human("박상현", 23);
	}
}
