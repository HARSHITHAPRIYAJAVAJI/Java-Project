package String;
public class Builder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Coding");

        System.out.println("Initial content: " + sb);

        // append()
        sb.append(" Rocks");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(7, " in Java");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(7, 15, " with Python");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(7, 20);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);


        // substring() via toString()
        String sub = sb.toString().substring(1, 6);
        System.out.println("Substring from index 1 to 5: " + sub);
    }
}
