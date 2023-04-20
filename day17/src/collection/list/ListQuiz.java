package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListQuiz {
	public static void main(String[] args) {
		Random ran = new Random(); 
		int cnt = 0;
		List<Integer> ranList = new ArrayList<>();
		List<Integer> userRanList = new ArrayList<>();
		
		while (ranList.size() < 6) {
			int ranNum = ran.nextInt(45)+1;
			if (!ranList.contains(ranNum)) {
				ranList.add(ranNum);
			}
		}
		System.out.println(ranList);
		while (true) {
			while (userRanList.size() < 6) {
				int ranNum = ran.nextInt(45)+1;
				if (!userRanList.contains(ranNum)) {
					userRanList.add(ranNum);
				}
			}
			
			if (ranList.equals(userRanList)) {
				break;
			}else {
				userRanList.clear();
				cnt++;
			}
		}
		System.out.println("당첨번호 : " + userRanList);
		System.out.println("로또가 " + cnt + "번만에 당첨되었습니다.");
	}
}
