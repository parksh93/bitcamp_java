package day02;

public class CastingExample2 {
	public static void main(String[] args) {
		/*
		 * 크기가 큰 데이터를 작은 데이터타입으로 바꾸려면
		 * 반드시 캐스팅 연산자(type)을 사용하여
		 * 명시적으로 형 변환을 해야합니다(downcasting)
		 */
		int i = 72;
		char c = (char)i;	//강제형 변환
		System.out.println(c);
		
		
		/*
		 * 강제 형변환의 경우 데이터 손실이 일어날 가능성이 있기 때문에
		 * 자동으로 처리해주지 않습니다.
		 */
		double d = 4.56565;
		int j = (int)d;
		System.out.println(j);

		/*
		 * 강제 형 변환시주의점은 해당 데이터 타입이
		 * 처리할 수 있는 범위를 넘어선 데이터를 강제로 다운캐스팅 하면
		 * 오버플로가 일어남
		 */
		int k = 1024;
		byte b = (byte)k;	//-128~127 범위에 1024 담기
		System.out.println(b);	//0인 이유: 1024 -> 000000000 000000000 000000100 000000000
								// 			byte형변환시 오른쪽부터 1바이트(8비트)만 남기고 앞부분 다 자름 -> 0만 남음
		
		 
	}
}
