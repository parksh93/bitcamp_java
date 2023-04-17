package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {
	public static void main(String[] args) {
		//배열은 참조형 변수이기 때문에 단순 대입시 문제가 발생
		int [] intArray = {1,2,3,4,5};
		System.out.println("배열1 주소 : " + intArray);
		System.out.println(Arrays.toString(intArray));
		System.out.println("-------------");
		
		
		//단순 대입으러 주소를 복사하는 경우를 얕은 복사(스택에서 복사)라 한다.
		//int [] intArray2 = intArray; //주소값이 넘어감
		
		//단수 대입으로 스택에서 주소값만복사하는게 아닌
		//힙의 자료룰 새로 똑같이 할당하는 복사를 깊은 복사(힙에서 복사)라한다
		int [] intArray2 = intArray.clone(); //주소가 아닌 배열안에 값이 복사됨
		
		intArray[0] = 100;
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(intArray2));
		System.out.println("배열2 주소 : " + intArray2);
	}
}
