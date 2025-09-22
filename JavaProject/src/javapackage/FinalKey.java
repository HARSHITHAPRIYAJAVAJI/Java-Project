package javapackage;

// Base class with final variable and final method
class F {
    final int a = 5; // final variable cannot be changed
    static String str = "bunny"; // static variable shared across all instances

    public final void met() {
        System.out.println("I am a final method from class F");
    }
}

// Derived class that does not override the final method
class A extends F {
    int a = 3; // This hides the final variable 'a' from class F, but doesn't override it
}

public class FinalKey {
    public static void main(String[] args) {
        F fr = new F();
        System.out.println("Value of a in F: " + fr.a);

        A ob = new A();
        System.out.println("Value of a in A: " + ob.a);

        // Accessing final method from base class
        ob.met();

        // Accessing static variable
        System.out.println("Static variable str: " + F.str);
    }
}