import java.util.*;
public class FactorialUsingRecursion {
    int factorial (int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        FactorialUsingRecursion obj = new FactorialUsingRecursion();
        int result = obj.factorial(n);

        System.out.println("Factorial of " + n + " is: " + result);
        sc.close();
    }
}
