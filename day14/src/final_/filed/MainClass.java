package final_.filed;

public class MainClass {
	public static void main(String[] args) {
		Person kim = new Person("김자바");
//		kim.natioality = "일본";	//final이기 때문에 변경 불가
//		kim.name = "채자바";
		kim.age = 12;
	}

}
