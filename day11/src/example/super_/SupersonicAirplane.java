package example.super_;

public class SupersonicAirplane extends Airplane{
	
	public SupersonicAirplane(String planeCode) {
		super(planeCode);	//super class의 생성자가 먼저 생성되고 사라진 후 sub class의 생성자가 생성된다
	}

	@Override
	public void fly() {
		if (this.speed < 900) {
			super.fly();
		}else if(this.speed + 300 <=2200 && this.gas >= 5) {
			this.speed += 300;
			this.gas -= 5;
		}else if(this.speed + 300 >= 2200 && this.gas >= 5) {
			this.speed = 2200;
			this.gas -=5;
		}else {
			System.out.println("연료가 부족합니다.");
		}
	}
}
