package exampl.thread2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Printer implements Runnable {
	@Override
	public void run() {
		System.out.println("500장 프리트를 시작합니다.");
		for (int i = 0; i < 500; i++) {
			Date d = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");

			try {
				System.out.println(sd.format(d) + " 프린터기가 프린트합니다.");
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
