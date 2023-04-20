package api.util.random;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random ran = new Random();
		
		//0.0이상, 1.0미만
		double d = ran.nextDouble();
		System.out.println(d);
		
		boolean b = ran.nextBoolean();
		System.out.println(b);
		
		int i = ran.nextInt();
		System.out.println(i);
		
		//정수 0이상 10미만 난수
		int in = ran.nextInt(10);
		System.out.println(in);
		
		//정수 1이상 11미만 난수 발생
		i = ran.nextInt(10) + 1;
		System.out.println(i);
		
	}
}
