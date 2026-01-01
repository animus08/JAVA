interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Monkey is jumping");
    }
    void bite(){
        System.out.println("Monkey is biting");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
}

public class MonkeyHumanInheritance {
    public static void main(String[] args){
        Human h = new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();

        Monkey m = new Monkey();
        m.jump();
        m.bite();
    }
}
