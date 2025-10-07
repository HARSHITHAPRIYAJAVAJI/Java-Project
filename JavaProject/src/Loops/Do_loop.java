package Loops;

public class Do_loop {
    int num = 1;

    Do_loop() {
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }

    public static void main(String[] args) {
        Do_loop f = new Do_loop();
    }
}