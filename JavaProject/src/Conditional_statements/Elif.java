package Conditional_statements;

public class Elif {
    int age = 20;

    public Elif() {
        if (age<=17) {
            System.out.println("He/She is a minor");
        } 
        else if(age>18 && age<21) {
            System.out.println("Not a minor anymore, an adult ");
        }
        else if(age>21) {
            System.out.println("A full adult ");
        }
    }

    public static void main(String[] args) {
        Elif obj = new Elif();
    }
}