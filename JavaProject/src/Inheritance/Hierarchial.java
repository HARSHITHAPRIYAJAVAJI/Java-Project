package Inheritance;

class Dad {
    int age = 79;
    String familyName = "Javaji";
    public void land() {
        System.out.println("Dad has many properties");
    }
    public void profession() {
        System.out.println("is a Farmer.");
    }

}

class Son1 extends Dad {
    int age = 45;

    public void land() {
        System.out.println("Son1 has some properties");
        System.out.println("Dad's age is: " + super.age);
    }
    public void profession() {
        System.out.print("I am a Software developer.And my dad " );
        super.profession();
    }
}

class Daughter extends Dad {
    int age = 42;
    String familyName = "Byreddy";
    public void land() {
        System.out.println("Daughter doesn't have any properties");
        System.out.println("Dad's age is: " + super.age);
    }
    public void profession() {
        System.out.print("I am a Housewife.And my dad ");
        super.profession();
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        Son1 s1 = new Son1();
        System.out.println("Son1's age: " + s1.age);
        s1.land();
        s1.profession();
        System.out.println(s1.familyName+" "+"is my family name");

        System.out.println();

        Daughter s2 = new Daughter();
        System.out.println("Daughter's age: " + s2.age);
        s2.land();
        s2.profession();
        System.out.println(s2.familyName+" "+"is my family name");
    }
}