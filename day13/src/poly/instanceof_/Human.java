package poly.instanceof_;

public class Human {
		private String name;
		private int age;
		
		public Human(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public Human() {
//			this.name = "noname";
//			this.age = 0;

			this("noname", 0);
		}
		
		public void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("--------------------------");
		}
}
