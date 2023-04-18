package exception.tryCatch;

public class TryCatchExample1 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
//		int j = 5;
		
		try {
			System.out.println(i / j);
			System.out.println(new StringBuffer("예외 발생 안할때만 실행"));
		} catch (Exception e) {
			System.out.println(new StringBuffer("0으로 나눠서 catch블록으로 넘어옴"));
		}
		System.out.println(new StringBuffer("어쨌든 잘 마무리"));
	}
}
