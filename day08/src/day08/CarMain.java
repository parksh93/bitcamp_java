package day08;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car("BMW", 5, 0, "박상현", 100);
		
//		c.modelName = "BMW";
//		c.maxPassengers = 4;
//		c.currentSpeed = 0;
//		c.gas = 100;
//		c.owner = "박상현";
		
		
		c.accelerate();
		c.accelerate();
		c.accelerate();

		c.showStatus();
		
		System.out.println();
		
		c.break_();
		c.break_();
		
		c.showStatus();
	}
}
