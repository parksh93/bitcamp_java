package exception.runtime;

public class NumberFormatExample {
	public static void main(String[] args) {
		String a = "12";
		String b = "43";
		
		StringBuilder sb = new StringBuilder("232");
		
		String re = sb.append(a).append(b).toString();
		
		System.out.println(re);
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		System.out.println(i + j);
		
		String str = "hello";
			
		System.out.println(Integer.parseInt(str));
	}
}
