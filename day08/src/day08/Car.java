package day08;

public class Car {
	public String modelName;	//차종
	public int maxPassengers;	//최대승객
	public int currentSpeed;	//속도
	public String owner;		//차주
	public int gas;				//연료량
	
	public final static int BOOST_SPEED = 10;
	public final static int BREAK_SPEED = 10;
	
	//생성자
	public Car(String mN, int mP, int cS, String own, int gas) {
		modelName = mN;
		maxPassengers = mP;
		currentSpeed = cS;
		owner = own;
		this.gas = gas;
	}
	
	//가속
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
		
	}
	
	//감속
	public void break_() {
		currentSpeed -= BREAK_SPEED;
	}
	
	//계기판 조회
	public void showStatus() {
		System.out.println("차종 : " + modelName);
		System.out.println("최대승객 : " + maxPassengers);
		System.out.println("속도 : " + currentSpeed);
		System.out.println("차주 : " + owner);
		System.out.println("연료량 : " + gas);
	}
	
}
