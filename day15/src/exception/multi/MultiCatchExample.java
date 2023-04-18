package exception.multi;

import java.util.Scanner;

public class MultiCatchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(new StringBuffer("1번째 데이터 : "));
			String data1 = sc.next();
			System.out.println(new StringBuffer("2번째 데이터 : "));
			String data2 = sc.next();
			
			//NumberFormatExeption 발생 가능
			int i = Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			//ArithmeticException 발생 가능
			int result = i / j;
			System.out.println(new StringBuffer().append(i).append("/").append(j).append("=").append(result));
			
			// NullPointerException 발생 가능
			String str = null;
			str.charAt(0);
			
		} catch (NumberFormatException | NullPointerException e) {
			System.err.println("데이터를 숫자만 넣어주세요");
			System.err.println("아니면 문자를 제대로 넣어");
		} catch (ArithmeticException e) {
			System.err.println("0으로 나눌 수 없습니다.");
		} catch(Exception e){
			System.err.println("알수없는 에러입니다.");
		} finally {
			sc.close();
		}
	}
}
