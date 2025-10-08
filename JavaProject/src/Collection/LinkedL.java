package Collection;
import java.util.LinkedList;

public class LinkedL {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();

        // Adding elements of different types
        ll.add(101);
        ll.add("Bunny");
        ll.add(208);

        // Display the LinkedList
        System.out.println(ll);

        // Remove element at index 2
        ll.remove(2);
        System.out.println(ll);

        // Add null values
        ll.add(null);
        ll.add(null);
        System.out.println(ll);

        // Access element at index 1
        System.out.println(ll.get(1));

	}

}