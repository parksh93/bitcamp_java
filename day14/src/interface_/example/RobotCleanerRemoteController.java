package interface_.example;

public class RobotCleanerRemoteController implements RemoteController{
	public String modelName;
	private String price;
	
	public RobotCleanerRemoteController(String modelName, String price) {
		this.modelName = modelName;
		this.price = price;
	}

	@Override
	public void turnOn() {
		System.out.println("로봇청소기를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("로봇청소기를 끕니다.");
	}
}
