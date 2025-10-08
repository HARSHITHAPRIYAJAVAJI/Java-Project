package Collection;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        // Adding key-value pairs
        hm.put(101, "Harshitha");
        hm.put(102, "Priya");
        hm.put(103, "Buny");

        System.out.println(hm); // {101=Harshitha, 102=Priya, 103=Buny}

        // Removing a key
        hm.remove(102);
        System.out.println(hm); // {101=Harshitha, 103=Buny}

        // Adding null key and null value
        hm.put(null, "Unknown");
        hm.put(104, null);
        System.out.println(hm); // {null=Unknown, 101=Harshitha, 103=Buny, 104=null}

        // Accessing a value by key
        System.out.println(hm.get(101)); // Harshitha
    }
}