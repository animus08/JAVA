abstract class AnimalAbs{
    abstract void sound();
}

class DogAbs extends AnimalAbs{
    void sound(){
        System.out.println("Woof");
    }
}

class LionAbs extends AnimalAbs{
    void sound(){
        System.out.println("Roar");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        DogAbs d = new DogAbs();
        LionAbs l = new LionAbs();
        d.sound();
        l.sound();   
    }
}
