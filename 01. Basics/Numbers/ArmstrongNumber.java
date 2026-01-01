import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        int count = 0;
        int temp = n;

        // Count number of digits
        while(temp != 0){
            count++;
            temp = temp / 10;
        }

        while(n!=0){
            int ld = n % 10;
            sum = sum + (int)Math.pow(ld, count);
            n = n / 10;
        }

        if(original == sum){
            System.out.println(original + " is an Armstrong number.");
        }
        else{
            System.out.println(original + " is not an Armstrong number.");
        }
        sc.close();
    }
}
