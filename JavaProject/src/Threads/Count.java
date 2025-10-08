package Threads;
class CountdownThread extends Thread {
    private final Object lock;
    private final int startFrom;

    public CountdownThread(Object lock, int startFrom) {
        this.lock = lock;
        this.startFrom = startFrom;
    }

    public void run() {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting to start countdown...");
                lock.wait(); // Wait for signal
                System.out.println(Thread.currentThread().getName() + " started countdown:");
                for (int i = startFrom; i >= 1; i--) {
                    System.out.println(Thread.currentThread().getName() + " → " + i);
                    Thread.sleep(500);
                }
                System.out.println(Thread.currentThread().getName() + " finished countdown!");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Count {
    public static void main(String[] args) {
        Object lock = new Object();

        CountdownThread t1 = new CountdownThread(lock, 5);
        CountdownThread t2 = new CountdownThread(lock, 3);

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000); // Let threads reach wait state
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        synchronized (lock) {
            System.out.println("Main thread sending signal to start countdown...");
            lock.notifyAll(); // Wake up all threads to begin countdown
        }
    }
}

