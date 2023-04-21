package exampl.thread4;

public class ThreadSafety extends Thread {
    
    static int share;
    
    public static void main(String[] args) {
      ThreadSafety t1 = new ThreadSafety();
      ThreadSafety t2 = new ThreadSafety();
      
      t1.start();
      t2.start();
    }
    
    //쓰레드 안전을 위해서 사용하는 메서드
    public synchronized static void sharePlus() {
    	System.out.println(share++); 
	}
    
    public void run() {
      for(int count = 0; count < 10; count++){
        sharePlus();
        try { sleep(10); }
        catch (InterruptedException e) {}
      }
    }
}