package poly.instanceof_;

public class MainClass {
	public static void main(String[] args) {
		Human h = new Human("사람",24);
		h.showInfo();
		
		Student s = new Student("자바", 22);
		s.showInfo();
		
		Cat c = new Cat("나비", 3);
		c.meow();
		
		System.out.println(h instanceof Human);
		System.out.println(s instanceof Human);
		//관계가 없기 때문에 에러발생
//		System.out.println(c instanceof Human);
		System.out.println(h instanceof Student);
		System.out.println(s instanceof Student);
//		System.out.println(c instanceof Student);
	}
}
