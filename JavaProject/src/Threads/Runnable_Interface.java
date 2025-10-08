package Threads;

class RunnableExample implements Runnable {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Runnable running: " + i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        RunnableExample r = new RunnableExample();
        Thread t = new Thread(r);
        t.start();
    }
}