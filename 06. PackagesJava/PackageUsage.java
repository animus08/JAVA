// Create a package name as Calculation and use its functionality in another class. 

// Call the Calculation class methods to perform arithmetic operations.
import Calculation.ArithmeticOperations;
import java.util.*;
public class PackageUsage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int additionResult = ArithmeticOperations.add(num1, num2);
        int subtractionResult = ArithmeticOperations.subtract(num1, num2);
        int multiplicationResult = ArithmeticOperations.multiply(num1, num2);
        int divisionResult = ArithmeticOperations.divide(num1, num2);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);


        // ArithmeticOperations calc = new ArithmeticOperations();
        // System.out.println("Addition: " + calc.add(num1, num2));
        // System.out.println("Subtraction: " + calc.subtract(num1, num2));
        // System.out.println("Multiplication: " + calc.multiply(num1, num2));
        // System.out.println("Division: " + calc.divide(num1, num2));



        sc.close();
    }
}
