package example.this_.car;

public class Car {
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;	//this : 인스턴스에 붙을 수 있는 대명사(멤버 변수를 지칭)
		speed = 0;
	}
	
	public void accel() {
		if (speed + 10 >= 150) {
			speed = 150;
		}else {
			speed += 10;
		}
	}
	
	public void showStatus() {
		System.out.println("모델명 : " + model);
		System.out.println("현재속도 : " + speed);
	}
}
