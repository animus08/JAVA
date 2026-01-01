import java.util.*;

public class UsingMethods {
    int a, b, add, sub, mul, div, rem;
    public static void main(String[] args) {
        UsingMethods um = new UsingMethods();
        um.input();
        um.process();
        um.output();
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sc.close();
    }

    void process() {
        add = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        rem = a % b;
    }

    void output() {
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Remainder: " + rem);
    }
}
