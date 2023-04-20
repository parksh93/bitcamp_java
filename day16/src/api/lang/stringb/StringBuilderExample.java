package api.lang.stringb;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JAVA");
		
		sb.append(" Program study"); //sb + Program study 와 동일
		System.out.println(sb);
		
		//인덱스 위치에 문자열 삽입
		sb.insert(12, "ming");
		System.out.println(sb);

		//인덱스 범위의 문자열 교체
		sb.replace(5, 16, "book");
		System.out.println(sb);
		
		sb.delete(4, 9);
		System.out.println(sb);
		
		System.out.println(sb.length());
	}
}
