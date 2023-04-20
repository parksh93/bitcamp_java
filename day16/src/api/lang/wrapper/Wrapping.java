package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {
	public static void main(String[] args) {
		int a = 100;
		double b = 2.31;
		char c = 'H';
		boolean d = false;
							//취소선 : deprecated(사용 중지)
		Integer val1 = a;	//new Integer(a);
		Double val2 = b;
		Character val3 = c;
		Boolean val4 = d;
		
		Object [] arr = {100, 2.21, 'A', false, val3, val1};
		System.out.println(Arrays.toString(arr));
		
		//Unwrapping : 래퍼 클래스를 다시 기본형자료로 돌리기
		// .자료형Value() 메서드
		int i = val1.intValue();
		double j = val2.doubleValue();
		
	}
}
