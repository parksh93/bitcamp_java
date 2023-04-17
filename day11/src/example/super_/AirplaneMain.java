package example.super_;

public class AirplaneMain {
	public static void main(String[] args) {
		SupersonicAirplane ap1 = new SupersonicAirplane("A12F2");
		
		while(ap1.gas-3 > 0) {
			ap1.fly();
			ap1.showStatus();
			System.out.println("-------------------");
		}
		
	}
}
