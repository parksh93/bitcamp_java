package day09;

public class GarbageCollectorTest {
	public int objetNum;
	
	//생성자(객체가 힙에 생성되기 직전에 실행되는 메서드)
	public GarbageCollectorTest(int number) {
		objetNum = number;
		System.out.println(objetNum + "번 객체 생성");
	}
	
	//소멸자(객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	@Override	//유지보수 측면에서 붙여주는게 좋다
	protected void finalize() throws Throwable {
		System.out.println(objetNum + "번 객체가 힙에서 삭제됩니다.");
	}
}
