package example.modi.protec.pack2;

import example.modi.protec.pack1.A;

public class D extends A{
	public D() {
		/*
		 * protected는 패키지가 다를 경우
		 * 두 클래스 사이에 상속관계가 있가면
		 * super 키워드를 이용해 부모쪽 참조를 허용한다 
		 */
		
		//A a = new A();
		super();	//super()생성자는 무조건 첫줄에 위치해야한다
		super.s = "hi";
		super.method();
		
	}
}
