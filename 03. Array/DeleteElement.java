import java.util.*;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be deleted: ");
        int delElement = sc.nextInt();

        int index = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == delElement){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element not found in the array.");
        }
        else{
            for(int i = index; i < n - 1; i++){
                arr[i] = arr[i + 1];
            }
            n--; // Reduce the size of the array

            System.out.println("Array after deletion: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
