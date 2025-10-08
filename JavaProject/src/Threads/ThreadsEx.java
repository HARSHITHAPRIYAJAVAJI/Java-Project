package Threads;

class threadExecuted extends Thread {
	public void run() {
		for(int i = 1; i<=5; i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class ThreadsEx {

	public static void main(String[] args) {
		threadExecuted t = new threadExecuted();
		t.start();

	}

}