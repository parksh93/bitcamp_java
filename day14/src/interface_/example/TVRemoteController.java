package interface_.example;

public class TVRemoteController implements RemoteController{
	public final int inch;
	public int chnenel;
	
	
	public TVRemoteController(int inch) {
		this.inch = inch;
	}

	@Override
	public void turnOn() {
		System.out.println("TV룰 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV룰 끕니다");
		
	}
	
	public void setChannelUp() {
		this.chnenel++;
	}
	public void setChannelDown() {
		if (this.chnenel -1 < 1) {
			this.chnenel = 1;
		}else {
			this.chnenel--;
		}
	}
	
	public void setChannel(int channel) {
		if (this.chnenel < 1) {
			this.chnenel = 1;
		}else {
			this.chnenel = channel;
		}
	}
}
