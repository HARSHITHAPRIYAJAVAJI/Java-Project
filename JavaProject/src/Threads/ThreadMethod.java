package Threads;

class IamThread extends Thread {
	 public void run() {
	        for (int i = 1; i <= 3; i++) {
	            try {
	                System.out.println("Hello from " + Thread.currentThread().getName());
	                Thread.sleep(1000);

	                // Yield to give other threads a chance
	                Thread.yield();

	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	 }
}
public class ThreadMethod {

	public static void main(String[] args) {
		IamThread t1 = new IamThread();
		IamThread t2 = new IamThread();

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Main thread waits until t1 and t2 are finished
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


	}

}