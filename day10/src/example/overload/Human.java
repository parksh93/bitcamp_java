package example.overload;

public class Human {
	int age;
	String name;
	
	public Human() {

	}
	
	public Human(String name){
		this.name = name;
		age = 21;
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
