// Create a class monkey with jump ( ) and bite ( ) methods 
// Create a class human which  inherits this monkey class and 
// implements basic animal interface with eat ( ) and sleep () methods

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

class human implements BasicAnimal{
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
}

public class Assignment2SectionBQ1 {
    public static void main(String[] args){
        human h = new human();
        h.eat();
        h.sleep();

        Monkey m = new Monkey();
        m.jump();
        m.bite();
    }
}
