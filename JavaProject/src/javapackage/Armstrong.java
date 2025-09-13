package javapackage;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000:");

        for (int num = 1; num <= 1000; num++) {
            int originalNum = num;
            int digits = 0;
            int temp = num;

            // Count number of digits
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
            

            temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                int power = 1;

                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }

            // Check if it's an Armstrong number
            if (sum == originalNum) {
                System.out.println(originalNum);
            }
        }
    }
}