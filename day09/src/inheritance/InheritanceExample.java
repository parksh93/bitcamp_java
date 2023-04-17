package inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Student st1 = new Student();
		
		st1.name = "박상현";
		st1.age = 20;
		st1.major = "기계공학";
		
		Salaryman sm1 = new Salaryman();
		
		sm1.name = "나직장";
		sm1.age = 30;
		sm1.salary = 5000000;
	}
}
