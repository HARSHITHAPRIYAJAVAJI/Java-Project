package javapackage;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean isPalindrome = true;
        int n=s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
