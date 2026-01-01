// import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] a = { 45, 78, 12, 89, 23, 67 };
        int n = a.length;
        int largest = a[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
            if(a[i] > slargest && a[i] != largest){
                slargest = a[i];
            }
        }
        System.out.println("Second largest element in the array: " + slargest);
    }
}
