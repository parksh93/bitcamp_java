package example.overload;

public class Cat {
	String name;
	String kind;
	
	public Cat() {
		name = "나비";
		kind = "러시안블루";
	}
	
	public Cat(String name) {
		System.out.println("지금부터 이 아이의 이름은" + name + "입니다.");
	}
	
	public void call() {
		System.out.println("야옹아 이리와");
	}
	
	public void call(String name) {
		System.out.println(name + "아 이리와");
	}
	 
}
