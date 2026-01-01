// Write a Java program to print the results of the following operations.
// Test Data:
// a.-5 + 8 * 6
// b. (55+9) % 9
// c. 20 +-3*5 / 8
// d. 5 + 15 / 3 * 2-8%3


public class ArithmeticOperations {
    public static void main(String[] args) {
        int result1 = -5 + 8 * 6;
        int result2 = (55 + 9) % 9;
        int result3 = 20 + -3 * 5 / 8;
        int result4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("a. -5 + 8 * 6 = " + result1);
        System.out.println("b. (55 + 9) % 9 = " + result2);
        System.out.println("c. 20 + -3 * 5 / 8 = " + result3);
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 = " + result4);
    }
}

