// Create a package name as Calculation and use its functionality in another class. 

// Call the Calculation class methods to perform arithmetic operations.
import Calculation.AssignmentCalculation;
import java.util.*;
public class Assignment2SectionBQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int additionResult = AssignmentCalculation.add(num1, num2);
        int subtractionResult = AssignmentCalculation.subtract(num1, num2);
        int multiplicationResult = AssignmentCalculation.multiply(num1, num2);
        int divisionResult = AssignmentCalculation.divide(num1, num2);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);

        sc.close();
    }
}
