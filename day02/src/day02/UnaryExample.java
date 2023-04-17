package day02;

import java.util.Iterator;
import java.util.Scanner;

public class UnaryExample {
	public static void main(String[] args) {
		//증감연산자
		int i = 1;
		int j = i++;	//후위연산자
		//int j = i를 먼저 수행하고 i++을 수행
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("---------------------");
		
		int x = 1;
		int y = ++x;	//전위연산자
		// 아래쪽에 주석으로 23, 24번라인에 출력될 값과 그 이류를 9,10번 라인처럼 서술하시오.
		//int x에 1을 더한후  int y에 대입하기 때문에 x와 y모두 2가 나옵니다.
		
		System.out.println(x);
		System.out.println(y);
				
		
	}
}
