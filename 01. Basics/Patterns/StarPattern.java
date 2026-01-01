import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
