package Collection;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        // Adding elements
        ts.add(101);
        ts.add(208);
        ts.add(55);
        
        System.out.println("Initial TreeSet: " + ts); // Sorted order

        // Removing an element
        ts.remove(208);
        System.out.println("After removing 208: " + ts);

        // Accessing first and last elements
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());

        // Checking if an element exists
        System.out.println("Contains 101? " + ts.contains(101));

        // Size of TreeSet
        System.out.println("Size of TreeSet: " + ts.size());
        ts.clear();
        System.out.println("After clear(): " + ts); // []
    }
}