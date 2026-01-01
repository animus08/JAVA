import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact = fact * i;
        }
        System.out.println("Factorial is: " + fact);
        sc.close();
    }
}
