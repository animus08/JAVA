// Write a program where a subclass overrides a method from its superclass. Use the super 
// keyword to call the superclass method from the overridden method.

class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    // Overriding the sound method
    @Override
    void sound() {
        // Calling the superclass method using super keyword
        super.sound();
        System.out.println("Dog barks");
    }
}

public class Assignment2SectionCQ3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // This will call the overridden method in Dog class
    }
}