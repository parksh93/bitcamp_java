package poly.hetero;

public class MainClass {
	public static void main(String[] args) {
		//단일 배열(동종 모음)
		int [] iar = {1,2,3,4};
		
		//A자료형의 힙주소를 배열로 저장
		A [] arr = new A[2];
		
		A a1 = new A();
		A a2 = new A();
		
		arr[0] = a1;
		arr[1] = a2;
		arr[1] = new A();
		
		//이중 모음(하나의 배열에 여러가지 자료형을 대입할 수 있다)
		// 부모클래스로 배열을 선언
		Object [] oArr = new Object[2];
		
		B b = new B();
		
		oArr[0] = b;
		oArr[0] = a1;
		oArr[1] = 1;
		oArr[1] = iar;
	}
}
