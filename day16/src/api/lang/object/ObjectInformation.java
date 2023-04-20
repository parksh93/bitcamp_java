package api.lang.object;

public class ObjectInformation {
	/*
	 *  toString 오버라이딩시
	 *  해당 인스턴스의 클래스 경로와 주소값대신
	 *  toString이 리턴하는 값으로 바꿔 콘솔에 찍을 수 있다
	 */
	
	
	@Override
	public String toString() {
		//return super.toString();	//주소값 리턴
		return "ObjectInformation 객체 정보는 숨겨져 있습니다";	//주소값 은닉
	}
}
