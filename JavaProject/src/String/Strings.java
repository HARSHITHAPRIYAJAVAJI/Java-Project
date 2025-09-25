package String;

public class Strings {
    static String s = "BUNNY"; // literal
    static String S = new String("bunny"); // object
    static String messy = "   Hello World!   "; // for trim


    public static void main(String[] args) {
        System.out.println("We have a string: " + S);
        System.out.println("The other string is: " + s);
        System.out.println("--Methods on Strings--");

        // Length
        System.out.println("Length of " + S + ": " + S.length());
        System.out.println("Length of " + s + ": " + s.length());

        // Character access
        System.out.println("Character at index 3 in " + s + ": " + s.charAt(3));
        System.out.println("Character at index 0 in " + S + ": " + S.charAt(0));

        // compareTo
        System.out.println("Comparing " + s + " and " + S + ": " + s.compareTo(S));

        // concat
        System.out.println("Concatenated: " + s.concat(S));

        // contains
        System.out.println("Does " + s + " contain 'UN'? " + s.contains("UN"));

        // equals
        System.out.println("Are " + s + " and " + S + " equal? " + s.equals(S));

        // toUpperCase and toLowerCase
        System.out.println("Uppercase of " + S + ": " + S.toUpperCase());
        System.out.println("Lowercase of " + s + ": " + s.toLowerCase());

        // replace
        System.out.println("Replace 'N' with 'M' in " + s + ": " + s.replace('N', 'M'));


        // trim
        System.out.println("Original with spaces: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");
    }
}