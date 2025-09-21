package javapackage;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Calls the sound() method from Animal
        System.out.println("Dog barks");
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}