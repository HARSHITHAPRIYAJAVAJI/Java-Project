package String;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("The original String is: " + sb);
        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);
        System.out.println("Length of " + sb + ": " + sb.length());
        

        // replace()
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
     // substring() via toString()
        String sub = sb.toString().substring(2, 7);
        System.out.println("Substring from index 2 to 6: " + sub);


    }
}