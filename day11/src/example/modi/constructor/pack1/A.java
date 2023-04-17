package example.modi.constructor.pack1;

public class A {
	A a1 = new A(true);	//public
	
	A a2 = new A(3);	//default
	
	A a3 = new A("hi");	//private
	
	public A(boolean b) {}
	
	A(int i) {}
	
	private A(String s) {}
	

	
}
