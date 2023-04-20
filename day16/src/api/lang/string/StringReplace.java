package api.lang.string;

public class StringReplace {
	public static void main(String[] args) {
		//자바 15버전부터 멀티라인 문자열을 지원함
		//자바 문자열은 여닫는 "를 한 줄에 작성해야했다
//		String a = "가나다
//				라 마바사 아자차카 타파하";
		
		//여닫는 따옴표를 여러줄에 걸쳐서 작성할때는 """
		String notice = """
				채종훈의 공지사항
				1. 파이썬 공부
				2. 파이썬 좋다
				3. 파이썬 이외의 언어는 기본기를 익히고 관심을 주세요.
				""";
		
		System.out.println(notice);
		
		String reNotice = notice.replace("파이썬", "자바");
		
		System.out.println(reNotice);
		
	}
}
