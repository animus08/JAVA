import java.util.*;
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int [] arr = new int[n+1];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();

        System.out.print("Enter the position to insert the element index wise: ");
        int position = sc.nextInt();

        for(int i = n; i > position; i--){
            arr[i] = arr[i - 1];
        }

        arr[position] = element;

        System.out.println("Array after insertion:");
        for(int i = 0; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}