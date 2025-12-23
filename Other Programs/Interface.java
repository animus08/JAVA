// Define an interface (renamed to avoid name collisions)
interface IAnimal {
    // Abstract method
    void makeSound();

    // Default method
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Implementing the interface in a class
class Dog implements IAnimal {
    // Providing implementation for the abstract method
    // @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Another class implementing the same interface
class Cat implements IAnimal {
    // Providing implementation for the abstract method
    // @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class to run the program
public class Interface {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        IAnimal myDog = new Dog();
        IAnimal myCat = new Cat();

        // Call methods
        myDog.makeSound(); // Outputs: Woof!
        myDog.sleep(); // Outputs: The animal is sleeping.

        myCat.makeSound(); // Outputs: Meow!
        myCat.sleep(); // Outputs: The animal is sleeping.
    }
}