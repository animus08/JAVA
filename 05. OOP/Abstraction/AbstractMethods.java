abstract class Fruit {
    abstract void taste();
    void color() {
        System.out.println("The color of the fruit is natural.");
    }
}

class Apple extends Fruit {
    void taste() {
        System.out.println("The taste of the apple is sweet.");
    }
}

class Lemon extends Fruit {
    void taste() {
        System.out.println("The taste of the lemon is sour.");
    }
}

public class AbstractMethods {
    public static void main(String[] args) {
        Fruit myApple = new Apple();
        myApple.taste();
        myApple.color();

        Fruit myLemon = new Lemon();
        myLemon.taste();
        myLemon.color();
    }
}
