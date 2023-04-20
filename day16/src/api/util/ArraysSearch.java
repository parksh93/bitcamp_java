package api.util;

import java.util.Arrays;

public class ArraysSearch {
	public static void main(String[] args) {
		int [] scores = {75, 47, 23, 56, 89};
		int [] scores2 = Arrays.copyOf(scores, 3); //0~2번 인덱스까지 가져옴
		
		//오름차순 정렬
		Arrays.sort(scores2);
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores2));
		
		int index = Arrays.binarySearch(scores2, 75); 	//bunarySearch : 이진 탐색
														//				일반 Search보다 빠름
														//				정렬이 되어 있어야 사용가능
														//				가장 먼저 배열의 중앙값을 검사하고 찾는 값이 아니면 찾는값보다 작거나 큰 영역을 날리고 남은 영역을 다시 검사한다
		System.out.println(index);
		
		//Arrays.equals(배열1, 배열2) : 배열 내부 요소 비교
		int [] arr1 = {1, 2, 3, 4};
		int [] arr2 = {1, 2, 3, 4};
		String result = Arrays.equals(arr1, arr2) ? "일치" : "불일치";
		System.out.println(result);
	}
}
