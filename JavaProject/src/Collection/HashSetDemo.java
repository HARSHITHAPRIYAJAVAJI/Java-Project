package Collection;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        // Adding elements
        hs.add(101);
        hs.add("Buny");
        hs.add(208);
        hs.add(null);
        hs.add(null); // Duplicate null won't be added

        System.out.println("Initial HashSet: " + hs); // Unordered, no duplicates

        // Removing an element
        hs.remove("Buny");
        System.out.println("After removing 'Buny': " + hs);

        // Checking if an element exists
        System.out.println("Contains 101? " + hs.contains(101)); // true

        // Checking size
        System.out.println("Size of HashSet: " + hs.size());

        

        // Clearing the HashSet
        hs.clear();
        System.out.println("After clear(): " + hs); // []
    }
}