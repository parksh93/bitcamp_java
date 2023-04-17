package example.override;

public class Human {
	public String name;
	public int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void  자기소개하기() { //오버라이드는 소스 단축적인 개념보다 설계의 개념에 가깝다. (소스의 통일성)
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public void 코딩하기() {
		System.out.println("일반인이라 코딩을 못합니다.");
	}
}
