package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();	//1.8버전부터 생성자에 제네릭 표기 안해도됨
//		List<String> list = new LinkedList<>();
		
		String str1 = "Java";
		String str2 = "SpringBoot";
		System.out.println(list);
		
		list.add(str1);
		list.add(str2);
		list.add("Database");
		list.add("JDBC");
		list.add("Database");
		System.out.println(list);
		
		
		int size = list.size();
		System.out.println(list.indexOf("Java"));
		list.remove("Database");
		System.out.println(list.contains("Database"));
		System.out.println(list);

					//람다식
		list.forEach(data -> System.out.println("내용 : " + data));
		
	}
}
