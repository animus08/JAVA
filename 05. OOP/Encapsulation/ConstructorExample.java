public class ConstructorExample {
    private String name;
    private int id;

    public ConstructorExample() {
        this("Unknown", -1);
    }

    public ConstructorExample(String name) {
        this(name, -1);
    }

    public ConstructorExample(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void info() {
        System.out.println("Name: " + name + ", Id: " + id);
    }

    public static void main(String[] args) {
        ConstructorExample c1 = new ConstructorExample();
        ConstructorExample c2 = new ConstructorExample("Bob");
        ConstructorExample c3 = new ConstructorExample("Carol", 100);
        c1.info();
        c2.info();
        c3.info();
    }
}
