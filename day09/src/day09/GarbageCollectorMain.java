package day09;


public class GarbageCollectorMain {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			GarbageCollectorTest test = new GarbageCollectorTest(i);
			test = null;

			//쓰레기 수집 강제 실행 명령어
			System.gc();
		}
		
	}
}
