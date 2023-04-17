package example.modi.constructor.pack2;

import example.modi.constructor.pack1.A;

public class C {
	A a1 = new A(false);
	//A a2 = new A(1);		//default 이기 때문에 다른 패키지에서 호출 불가
	//A a3 = new A("s");	//private 이기 때문에 다른 클래스, 패키지 에서 호출 불가
	
}
