package javapackage;

public class Operators {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 15;
        boolean x = true, y = false;
        System.out.println("-- Arithmetic Operators --");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("c % a = " + (c % a));
        System.out.println("\n-- Relational Operators --");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < c: " + (a < c));
        System.out.println("c >= a: " + (c >= a));
        System.out.println("b <= a: " + (b <= a));
        System.out.println("\n-- Logical Operators --");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println("\n-- Bitwise Operators --");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("c >> 1: " + (c >> 1));
        System.out.println("\n-- Assignment Operators --");
        int d = a;
        System.out.println("d = a: " + d);
        d += b;
        System.out.println("d += b: " + d);
        d *= 2;
        System.out.println("d *= 2: " + d);
        d /= 3;
        System.out.println("d /= 3: " + d);
        d %= 4;
        System.out.println("d %= 4: " + d);
        System.out.println("\n-- Unary Operators --");
        int e = 7;
        System.out.println("e = " + e);
        System.out.println("++e = " + (++e));
        System.out.println("--e = " + (--e));
        System.out.println("e++ = " + (e++));
        System.out.println("e-- = " + (e--));
        System.out.println("e = " + e);
        System.out.println("\n-- Ternary Operator --");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println("Result: " + result);

	}

}
