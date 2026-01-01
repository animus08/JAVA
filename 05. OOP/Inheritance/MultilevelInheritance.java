import java.util.*;

class MultilevelInheritance {
    int a, b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sc.close();
    }
}
class SubClassLevel1 extends MultilevelInheritance{
    void calculate(){
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}
class SubClassLevel2 extends SubClassLevel1{
    void display(){
        System.out.println("\nValues: a = " + a + ", b = " + b);
    }

    public static void main(String[] args){
        SubClassLevel2 obj = new SubClassLevel2();
        obj.input();
        obj.display();
        obj.calculate();
    }
}
