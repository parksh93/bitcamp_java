package interface_.example;

public interface RemoteController {
	int MAX_BATTERY = 100;	//public과 static이 자동을 붙음
	int MIN_BATTERY = 0;	//상수 처리
	
	//리모컨이 가져야하는 필수 기능에 대해서 정의
	public void turnOn();
	
	public void turnOff();
}
