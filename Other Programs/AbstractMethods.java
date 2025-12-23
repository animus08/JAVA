// Abstract class
abstract class Fruit {
    // Abstract method (does not have a body)
    abstract void taste();

    // Regular method
    void color() {
        System.out.println("The color of the fruit is natural.");
    }
}

// Subclass that extends the abstract class
class Apple extends Fruit {
    // Providing implementation for the abstract method
    void taste() {
        System.out.println("The taste of the apple is sweet.");
    }
}

// Another subclass
class Lemon extends Fruit {
    // Providing implementation for the abstract method
    void taste() {
        System.out.println("The taste of the lemon is sour.");
    }
}

// Main class to demonstrate the functionality
public class AbstractMethods {
    public static void main(String[] args) {
        Fruit myApple = new Apple();
        myApple.taste(); // Output: The taste of the apple is sweet.
        myApple.color(); // Output: The color of the fruit is natural.

        Fruit myLemon = new Lemon();
        myLemon.taste(); // Output: The taste of the lemon is sour.
        myLemon.color(); // Output: The color of the fruit is natural.
    }
}
