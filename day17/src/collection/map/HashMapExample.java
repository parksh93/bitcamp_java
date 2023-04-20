package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("보쌈정식", 8000);
		map.put("해물칼국수", 8000);
		map.put("명동칼국수", 8500);
		//중복 key를 넣으면, 가장 마지막에 넣은 하나만 적용
		map.put("보쌈정식", 9000);
		
		System.out.println(map);
		
		Set<Entry<String, Integer>> s = map.entrySet();
		
		Set<String> s2 = map.keySet();
		Iterator<String> kIter = s2.iterator();
		
		Collection<Integer> s3 = map.values();
		
		s.forEach(name -> System.out.println(name));
		System.out.println();
		s2.forEach(name -> System.out.println(name));
		System.out.println();
		s3.forEach(name -> System.out.println(name));
		System.out.println();
		
		if (!map.containsKey("탕수육")) {
			System.out.println("값 없음");
		}
		
		int price = map.get("해물칼국수");
		System.out.println(price);
		System.out.println();
		
		while (kIter.hasNext()) {
			System.out.println(map.get(kIter.next()));
		}
	}
	
}
