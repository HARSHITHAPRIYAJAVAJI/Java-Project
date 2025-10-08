package ExceptionHandling;

public class Nested_Try {
	    public static void main(String[] args) {
	        try {
	            int[] numbers = {10, 20, 30};

	            try {
	                int result = numbers[3]; // This will cause ArrayIndexOutOfBoundsException
	                System.out.println("Element: " + result);
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Inner catch: Invalid array index.");
	            }

	            int division = 10 / 0; // This will cause ArithmeticException
	            System.out.println("Division: " + division);

	        } catch (ArithmeticException e) {
	            System.out.println("Outer catch: Cannot divide by zero.");
	        }
	    }
	}
