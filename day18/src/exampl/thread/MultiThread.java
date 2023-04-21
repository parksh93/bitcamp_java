package exampl.thread;

//보조쓰레드에서 실행할 내용을 정의하기 위해서
//1. Runnable 인터페이스 구현
public class MultiThread implements Runnable {

	// 2. Runnable 인터페이스의 run() 메서드를 오버라이딩해 실행할 내용을 적는다
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("보조쓰레드 : 실행1");
				Thread.sleep(1000); // 밀리초
									// checked exception
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
