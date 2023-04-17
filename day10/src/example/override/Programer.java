package example.override;

public class Programer extends Human{
	public int career;
	public String programLanguage;
	
	public Programer(String name, int age, int career, String programLanguage) {
		super(name, age);
		this.career = career;
		this.programLanguage = programLanguage;
	}
	
	@Override
	public void 코딩하기() {
		System.out.println("코딩을 배워 코딩이 가능합니다.");
	}
	
	@Override
	public void 자기소개하기() {
		super.자기소개하기();
		System.out.println(programLanguage + "를 " + career + "년 했습니다.");
	}
}
