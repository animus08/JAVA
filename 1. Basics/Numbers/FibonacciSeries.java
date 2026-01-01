import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for(int i = 2; i < n ; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
