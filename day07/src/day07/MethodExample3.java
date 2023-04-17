package day07;

public class MethodExample3 {
	/*
	 * 반환 유형(return type)
	 * 
	 * 1. 반환값은 메서드를 호출한 곳으로 전달해주는 return구문 우측 값을 의미한다
	 * 
	 * 2. 매개변수는 여러개를 입력받을 수 있지만 반환값은 오로지 하나여야 한다
	 * 
	 * 3. return 키워드를 사용해 반환값을 지정할 수 있다
	 * 
	 * 4. 전달할 반환값의 자료형을 반환 유형이라고 한다
	 * 
	 * 5. 반환값이 있는 메서드는 호출문 위치에 하나의 값이 전달되기 때문에 매직넘버 대신 사용할 수 있다
	 * 
	 * 6. 반환값이 없는 메서드는 void를 기입한다 이때 return구문을 쓰지 않아도 된다(break대용으로 쓸 수는 있다)
	 * 
	 * 7. 모든 메서드는 return을 만나는 순간 즉시 종료된다
	 *    분기가 아닌 return구문 하단에는 추가 코드를 작성하면 경고가 뜬다
	 */
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void callMyName(String name) {
		//문자열도 배열이므로 .length로 길이를 셀 수 있다
		if (name.length() < 2) {
			System.out.println("이름은 최소 2글자 이상 입력해야 합니다.");
			return;
		}
		System.out.println("내이름은 " + name + "입니다.");
	}
	
	//배열 리턴시 자료형에도 배열임을 명시해야 합니다.
	public static int[] totalOperate(int n1, int n2) {
		int [] total = {n1+n2,n1-n2,n1*n2,n1/n2};
		return total;
	}
	
	public static void main(String[] args) {
		int result = add(3,5);
		System.out.println(result);
		
		//리턴자료가 있는 함수는 매직넘버 대신 사용 가능
		int result2 = add(add(2, 4), add(5, 6));
		System.out.println(result2);
		
		int [] total = totalOperate(20, 7);
		System.out.println(total[0]);
		System.out.println(total[1]);
		System.out.println(total[2]);
		System.out.println(total[3]);
		
		callMyName("박상현");
		callMyName("채");
		
	}
}
