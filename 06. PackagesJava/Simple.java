import operations.Calculator;
import java.util.*;

public class Simple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		int sum = Calculator.sum(a, b);
        int difference = Calculator.subtract(a, b);

		System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

		sc.close();
	}
}
