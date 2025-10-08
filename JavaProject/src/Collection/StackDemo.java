package Collection;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();

        // Adding elements
        s.push(101);
        s.push("Buny");
        s.push(208);

        // Displaying stack
        System.out.println("Initial Stack: " + s); // [101, Buny, 208]

        // Removing top element
        s.pop();
        System.out.println("After pop(): " + s); // [101, Buny]

        // Adding null values
        s.push(null);
        s.push(null);
        System.out.println("After pushing nulls: " + s); // [101, Buny, null, null]

        // Access top element without removing
        System.out.println("Top element (peek): " + s.peek()); // null

        // Checking if stack is empty
        System.out.println("Is stack empty? " + s.empty()); // false

        // Searching for an element
        System.out.println("Position of 'Buny': " + s.search("Buny")); // 3 (from top, 1-based)

        // Size of the stack
        System.out.println("Stack size: " + s.size()); // 4

       
        // Clearing the stack
        s.clear();
        System.out.println("After clear(): " + s); // []
    }
}