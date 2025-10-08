package ExceptionHandling;

public class TryKw {

	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0; // This will cause ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Oops! Cannot divide  a number by zero.");
	        }
	    }
	}

