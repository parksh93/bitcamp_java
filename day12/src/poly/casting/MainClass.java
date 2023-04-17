package poly.casting;

public class MainClass {
	public static void main(String[] args) {
		//Promotion이 적용되면 자식 클래스에만 정의된 요소 조회 불가능
		Parent p = new Child();
		
		p.method1();
		p.method2(); //오버라이딩된 메서드는 타입상관없이 인스턴스의 자식쪽 메서드 호출
		//p.method3();
		
		Child c =  (Child)p; //부모타입 변수를 자식으로 강제 형변환
		c.method3();
		
		Child cc = new Child();
		cc.method3();
	}
}
