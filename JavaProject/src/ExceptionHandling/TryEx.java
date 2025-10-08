package ExceptionHandling;

public class TryEx {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // This line triggers the exception
        } catch (NullPointerException e) {
            System.out.println("The null value cannot be read.");
        }
        finally {
        	System.out.println("Ths is finally block");
        	
        }
    }
}