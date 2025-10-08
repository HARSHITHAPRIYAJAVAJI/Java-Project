package ExceptionHandling;
public class ThrowKw {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            // Manually throwing an exception
            throw new RuntimeException("You must be at least 18 years old.");
        }

        System.out.println("Access granted.");
    }
}