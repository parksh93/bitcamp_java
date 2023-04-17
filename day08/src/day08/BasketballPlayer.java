package day08;

public class BasketballPlayer {
	public String name;
	public int heigt;
	public int age;
	public int salary;
	
	public BasketballPlayer(String name, int heigt, int age, int salary) {
		this.name = name;
		this.heigt = heigt;
		this.age = age;
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(heigt);
		System.out.println(age);
		System.out.println(salary);
	}
	
	public void dunkShoot() {
		if(heigt > 190) {
			System.out.println("덩크슛 성공");
		}else {
			System.out.println("골대에 안닿음");
		}
	}
}
