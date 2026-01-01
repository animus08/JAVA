// Write a Java program to multiply the corresponding elements of two integer
// arrays.
// Sample Output:
// Array1: [1, 3,-5, 4]
// Array2: [1, 4,-5,-2]
// Result: 1 12 25-8

public class MultiplyCorrespondingElements {
    public static void main(String[] args) {
        int[] array1 = { 1, 3, -5, 4 };
        int[] array2 = { 1, 4, -5, -2 };
        int[] result = new int[array1.length];

        // Multiplying corresponding elements
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }

        // Printing the result
        System.out.print("Result: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
