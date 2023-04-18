package exception.custom;

public class BalanceInsufficienException extends RuntimeException {
	/*
	 *  일반적으로 사용자 정의 예외 클래스를 만들때는
	 *  기본생성자와 예외 원인 메세지를 받는 생성자를 
	 *  두개 오버로딩해서 선언만 해줍니다.
	 */
	public BalanceInsufficienException() {}
	public BalanceInsufficienException(String message) {
		super(message);
	}
}
