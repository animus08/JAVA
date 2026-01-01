import java.util.*;
public class CalculatorUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a, b, ch;
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Choose an operator (+, -, *, /): ");
        ch = sc.next().charAt(0);

        int result;
        if(ch == '+'){
            result = a + b;
            System.out.println("Result: " + result);
        }
        else if(ch == '-'){
            result = a - b;
            System.out.println("Result: " + result);
        }
        else if(ch == '*'){
            result = a * b;
            System.out.println("Result: " + result);
        }
        else if(ch == '/'){
            result = a / b;
            System.out.println("Result: " + result);
        }
        else{
            System.out.println("Invalid operator!");
        }
        sc.close();
    }
}