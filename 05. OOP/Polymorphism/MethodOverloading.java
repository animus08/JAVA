public class MethodOverloading {
    // Compile-time polymorphism (method overloading)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.add(2, 3));
        System.out.println(mo.add(2.5, 3.7));
        System.out.println(mo.add(1, 2, 3));
    }
}
