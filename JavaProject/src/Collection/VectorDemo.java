package Collection;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        // Adding elements
        v.add(101);
        v.add("Buny");
        v.add(208);

        System.out.println("Initial Vector: " + v); // [101, Buny, 208]

        // Removing element at index 1
        v.remove(1);
        System.out.println("After removing index 1: " + v); // [101, 208]

        // Adding null values
        v.add(null);
        v.add(null);
        System.out.println("After adding nulls: " + v); // [101, 208, null, null]

        // Accessing element at index 1
        System.out.println("Element at index 1: " + v.get(1)); // 208

        // Checking if vector contains a specific element
        System.out.println("Contains 101? " + v.contains(101)); // true

        // Checking size of the vector
        System.out.println("Size of Vector: " + v.size());

        // Checking if vector is empty
        System.out.println("Is Vector empty? " + v.isEmpty()); // false

        // Clearing the vector
        v.clear();
        System.out.println("After clear(): " + v); // []
    }
}