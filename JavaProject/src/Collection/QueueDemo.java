package Collection;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(101);
        pq.add(208);
        pq.add(55);
        // pq.add("Buny"); // Will throw ClassCastException if mixed types
        // pq.add(null);   // Not allowed in PriorityQueue

        System.out.println(pq); // Natural ordering

        pq.remove(); // Removes head
        System.out.println(pq);

        System.out.println(pq.peek()); // Access head
    }
}