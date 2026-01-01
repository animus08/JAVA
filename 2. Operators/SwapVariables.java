// Write a Java program to swap two variables without using third variable.

import java.util.*;
public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two variables
        System.out.print("Enter first variable (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second variable (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using third variable
        a = a + b; // Step 1: a now holds the sum of a and b
        b = a - b; // Step 2: b is now original a
        a = a - b; // Step 3: a is now original b

        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        sc.close();
    }
}