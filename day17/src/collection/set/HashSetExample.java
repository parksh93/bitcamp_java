package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Naver");
		set.add("Naver");
		set.add("Kakao");
		set.add("Line");
		set.add("Coopang");
		set.add("Bamin");
		
		System.out.println(set);
		
		Iterator<String> i = set.iterator();
		
		while (i.hasNext()) {
			String s = i.next();
			if (s.equals("Naver1")) {
				System.out.println(s);
				break;
			}
		}
		
		//예외 발생(NoSuchElementException)
//		i.next();
	}
}
