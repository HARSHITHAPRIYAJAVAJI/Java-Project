package Conditional_statements;

public class If_else {
    int age = 45;

    public If_else() {
        if (age > 18) {
            System.out.println("Eligible to drive a car");
        } else {
            System.out.println("Not-eligible to drive a car");
        }
    }

    public static void main(String[] args) {
        If_else obj = new If_else();
    }
}