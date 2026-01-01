interface IAnimal {
    void makeSound();
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog2 implements IAnimal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat2 implements IAnimal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        IAnimal myDog = new Dog2();
        IAnimal myCat = new Cat2();
        myDog.makeSound();
        myDog.sleep();
        myCat.makeSound();
        myCat.sleep();
    }
}
