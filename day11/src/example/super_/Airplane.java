package example.super_;

public class Airplane {
	String planeCode;
	int speed;
	int gas;
	
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 100;
	}
	
	
	public void fly() {
		if (gas - 3 > 0) {
			if (speed + 100 >= 900) {
				speed = 900;
				gas -= 3;
			}else {
				speed += 100;
				gas -= 3;
			}
		}else {
			System.out.println("연료부족");
		}
	}
	
	public void showStatus() {
		System.out.println("편명 : " + planeCode);
		System.out.println("속도 : " + speed);
		System.out.println("연료 : " + gas);
	}
	
}
