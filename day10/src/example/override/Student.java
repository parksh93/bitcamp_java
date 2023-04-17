package example.override;

public class Student extends Human{
	
	public String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override	// 어노테이션 : 유지보수 측면에서 적어주는게 좋다 만약 부모클래스의 메서드와 이름이 다를 경우 새로운 메서드정의로 인식하기 때문에
	public void 자기소개하기() {
		super.자기소개하기();
		System.out.println("전공 : " + major);
	}
}
