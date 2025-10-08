package Threads;

class FirstThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("First Thread: " + i);
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Second Thread: " + i);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        t1.start();
        t2.start();
    }
}


