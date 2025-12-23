// import java.util.*;

abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Woof");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("Roar");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();   
    }
}