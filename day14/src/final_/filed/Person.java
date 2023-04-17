package final_.filed;

public class Person {
	/*
	 *  final변수는 단 한번 초기화 될 수 있고
	 *  이후에는 변경이 불가능하기 때문에
	 *  선언시에 아예 직접 초기화를 해주거나
	 *  혹은 생성자에서 초기화를 해줘야 한다
	 */
	
	public final String natioality = "대한민국";	//선언시 초기화
	public final String name;					//생성자를 통한 초기화
	public int age;								//멤버변수이기 때문에 초기화 의무 없음
	
	public Person(String name) {
		this.name = name;
	}
}
