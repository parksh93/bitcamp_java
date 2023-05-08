package self_java;

public class ReculsiveFunction {
	public static void ref(int n) {
		if(n == 0) return;
		System.out.println("안녕");
		ref(n-1);
	}
	
	public static int factorial(int n) {
		if(n == 0) { 
			return 1;
		}else {
			//5 * 4 -> 5 * 4 * 3 -> 5 * 4 * 3 * 2 -> 5 * 4 * 3 * 2 * 1 ->0이되면서 종료
			return n * factorial(n-1);
		}
		
	}
	public static int fibonachi(int n) {
		if(n==0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		else if(n == 2) {
			return 1;
		}else {
			return fibonachi(n-1) + fibonachi(n-2);
		}
	}
	public static void main(String[] args) {
		ref(4);
		System.out.println(factorial(5));
		System.out.println(fibonachi(7));
	}
}
