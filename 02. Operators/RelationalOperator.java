/* Relational Operator Example... */
import java.util.Scanner;

class RelationalOperator {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter two Numbers.. ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        obj.close();
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.print("a == b: " + (a == b));
        System.out.print("a != b: " + (a != b));
        System.out.print("a >= b: " + (a >= b));
        System.out.print("a <= b: " + (a <= b));
    }
}