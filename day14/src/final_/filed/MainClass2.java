package final_.filed;

import java.util.Arrays;

public class MainClass2 {
	public static void main(String[] args) {
		Collector c1 = new Collector();
		System.out.println(Arrays.toString(c1.stickers));
		
		c1.stickers[0] = "꼬부기";	//변경가능한 이유 : stickers는 *200번지라는 배열의 주소를 가지고 있고
									//               그 *200번지를 final을 통해 변경하지 않겠다고 선언하였지만
		                            //				배열이 가지고 있는 피카츄라는 값은 변경되어도 *200번지 내에서 변경된거기 때문에 변경이 가능하다
		
		System.out.println(Arrays.toString(c1.stickers));
		
		
	}
}
