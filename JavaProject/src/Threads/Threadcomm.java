package Threads;


class Create extends Thread {
    private final Object lock;

    public Create(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName() + " is running and now waiting...");
                lock.wait();  // Thread goes into waiting state
                System.out.println(Thread.currentThread().getName() + " resumed after notification!");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Threadcomm {

	public static void main(String[] args) {
		 Object lock = new Object();

		 Create t1 = new Create(lock);
		 Create t2 = new Create(lock);
		 t1.start();
	     t2.start();
	     try {
	    	 Thread.sleep(3000); // Give time for threads to start and call wait()
	     } catch (InterruptedException e) {
	         System.out.println(e);
	     }

	     synchronized (lock) {
	          // Notify one waiting thread
	          System.out.println("Main thread calling notify()");
	          lock.notify();
	          try {
	              Thread.sleep(2000); // Small delay before notifyAll
	          } catch (InterruptedException e) {
	               System.out.println(e);
	          }

	          // Notify all waiting threads
	          System.out.println("Main thread calling notifyAll()");
	          lock.notifyAll();
	        }
	    }
}
