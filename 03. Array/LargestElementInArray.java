// import java.util.*;
public class LargestElementInArray {
    public static void main(String[] args) {
        int [] a = {45, 78, 12, 89, 23, 67};
        int n = a.length;
        int max = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
}
