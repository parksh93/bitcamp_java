package example.override;

public class OverrideExample {
	public static void main(String[] args) {
		Student st = new Student("김자바",21,"컴퓨터과학");
		
//		st.name = "김자바";
//		st.age = 21;
//		st.major = "컴퓨터과학";
		
		st.자기소개하기();
		st.코딩하기();
		
		Programer pr = new Programer("박학생", 22, 2, "java");
		
		pr.자기소개하기();
		pr.코딩하기();
	}
}
