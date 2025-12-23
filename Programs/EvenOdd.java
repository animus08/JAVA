package Programs;

import java.util.*;
public class EvenOdd {
    public static void main(String [] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
        sc.close();
    }
}
