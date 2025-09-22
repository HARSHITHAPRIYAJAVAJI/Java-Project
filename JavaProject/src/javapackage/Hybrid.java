package javapackage;

// Base class
class Head {
    int age = 79;
    String familyName = "Javaji";

    public void land() {
        System.out.println("Dad has many properties");
    }

    public void profession() {
        System.out.println("is a Farmer.");
    }
}

// Intermediate class extending Dad
class Son extends Head {
    int age = 45;

    public void land() {
        System.out.println("Son1 has some properties");
        System.out.println("Dad's age is: " + super.age);
    }

    public void profession() {
        System.out.print("I am a Software developer. And my Dad ");
        super.profession();
    }
}

// Grandson class extending Son1 (multilevel)
class GrandSon extends Son {
    int age = 20;

    public void land() {
        System.out.println("GrandSon is still studying, no properties yet.");
        System.out.println("Dad's age is: " + super.age);
    }

    public void profession() {
        System.out.print("I am a Student. My father ");
        super.profession();
    }
}

// Another child class extending Head (hierarchical)
class Daug extends Head {
    int age = 42;
    String familyName = "Byreddy";

    public void land() {
        System.out.println("Daughter doesn't have any properties");
        System.out.println("Dad's age is: " + super.age);
    }

    public void profession() {
        System.out.print("I am a Housewife. And my Dad ");
        super.profession();
    }
}

// Main class
public class Hybrid {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println("Son1's age: " + s1.age);
        s1.land();
        s1.profession();
        System.out.println(s1.familyName + " is my family name");
        System.out.println("-----------");

        System.out.println();

        Daug s2 = new Daug();
        System.out.println("Daughter's age: " + s2.age);
        s2.land();
        s2.profession();
        System.out.println(s2.familyName + " is my family name");
        System.out.println("-----------");

        System.out.println();

        GrandSon gs = new GrandSon();
        System.out.println("GrandSon's age: " + gs.age);
        gs.land();
        gs.profession();
        System.out.println(gs.familyName + " is my family name");
    }
}