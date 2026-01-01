// Write a Java program to get the largest value between the first 
// and last elements of an array (length 3) of integers

public class LargestBetweenFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30}; 

        // Get the first and last elements
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Determine the largest value
        if(firstElement > lastElement) {
            System.out.println("Largest value between first and last elements: " + firstElement);
        } else {
            System.out.println("Largest value between first and last elements: " + lastElement);
        }
    }
}

// We can also use for loop-
// largest = arr[0];
// for(int i = 0; i < arr.length; i++){
//     if(arr[i] > largest){
//         largest = arr[i];
//     }
// }