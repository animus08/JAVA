import java.util.*;
public class GreatestNumber {
    public static void main(String [] args){
        int a, b, c, greatest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b){
            if(a > c){
                greatest = a;
                System.out.println("Greatest number is: " + greatest);
            }
            else{
                greatest = c;
                System.out.println("Greatest number is: " + greatest);
            }
        }
        else{
            if(b > c){
                greatest = b;
                System.out.println("Greatest number is: " + greatest);
            }
            else{
                greatest = c;
                System.out.println("Greatest number is: " + greatest);
            }
        }
        sc.close();
    }
}
