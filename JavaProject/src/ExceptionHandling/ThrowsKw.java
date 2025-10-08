package ExceptionHandling;
public class ThrowsKw {

    // Method that might throw an exception
    public static void getElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        System.out.println("Element: " + arr[index]);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            getElement(numbers, 5); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}