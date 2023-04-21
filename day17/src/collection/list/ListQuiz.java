package collection.list;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListQuiz {
	private long cnt;
	private final List<Integer> ranList = lottoNumRaffle();
	private List<Integer> userRanList;
	
	public long addCnt() {
		return cnt++;
	}

	//로또 추첨 
	public List<Integer> lottoNumRaffle() {
		Random ran = new Random(); 
		List<Integer> lottoList = new ArrayList<>();
		
		while (lottoList.size() < 6) {
			//Integer ranNum
			int ranNum = ran.nextInt(45)+1; //ran.nextInt(1, 46)
			if (!lottoList.contains(ranNum)) {
				lottoList.add(ranNum);
			}
		}
		Collections.sort(lottoList);
		
		return lottoList;
	}
	
	//당첨여부 비교
	public void lottoWinComparison() {
		while (true) {
			userRanList = lottoNumRaffle();
			
			if (ranList.equals(userRanList)) {
				break;
			}else {
				userRanList.clear();
				addCnt();
			}
		}
		showView();
	}
	
	public void showView() {
		DecimalFormat df = new DecimalFormat("###,###");
		
		System.out.println("추첨번호 : " + ranList);
		System.out.println("당첨번호 : " + userRanList);
		System.out.println("로또가 " +  df.format(cnt) + "번만에 당첨되었습니다.");
		System.out.println(df.format(cnt * 1000) + "원의 돈을 사용했습니다.");
	}
}
