public class ReversingInArray {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};   
        int n = a.length;   // length of array

        for(int i = n - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
