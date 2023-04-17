package day03;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		//배열선언 - stack에 배열주소를 담을 변수 생성
		int [] score;
		
		//배열 생성 - heap에 실제 데이터가 저장될 공간을 생성
		//배열은 생성시 크기 명시
		score = new int[5];	//해당 배열의 주소를 담는다
							//new -> heap에 생성한다는 뜻
		System.out.println(score);	//주소가 나온다
		 
		//배열 초기화
		score[0] = 12;
		score[1] = 22;
		score[3] = 124;
		score[4] = 125;
		
		//배열값 참조(조회)
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		/*
		 * 배열 내부에 저장된 값을 한눈에 문자열로 보는 방법 -> Arrays.toString(배열변수)
		 */
		System.out.println(Arrays.toString(score));

		//배열의 길이 확인 .lenght
		System.out.println(score.length);
		
		//배열의 선언과 생성을 동시에 하는 방법
		int [] iAr = new int[7];
		
		//배열의 선언과 초기화를 동시에 하는 방법
		int [] iAr2 = {1,2,3,4};
		
		System.out.println(Arrays.toString(iAr));
		System.out.println(Arrays.toString(iAr2));
		
	}
	
}
