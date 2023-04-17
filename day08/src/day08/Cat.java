package day08;

public class Cat {
	public String name;
	public int age;
	public String kind;
	public String color;
	
	public Cat(String name, int age, String kind, String color) {
		this.name = name;
		this.age = age;
		this.kind = kind;
		this.color = color;
	}
	
	public void showCatInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(kind);
		System.out.println(color);
	}
}
