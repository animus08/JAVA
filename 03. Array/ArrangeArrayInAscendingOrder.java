// import java.util.*;
public class ArrangeArrayInAscendingOrder {
    public static void main(String[] args) {
        {
            int [] arr = {34, 12, 5, 66, 23};
            int n = arr.length;

            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Array in ascending order:");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}