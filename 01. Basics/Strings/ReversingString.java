import java.util.*;
public class ReversingString {
    // We have 3 ways to reverse a string in Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        String reversed1 = sb.reverse().toString();
        System.out.println("Reversed using StringBuilder: " + reversed1);

        // 2. Using StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        String reversed2 = sbf.reverse().toString();
        System.out.println("Reversed using StringBuffer: " + reversed2);

        // 3. Using for loop
        String reversed3 = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed3 += str.charAt(i);
        }
        System.out.println("Reversed using for loop: " + reversed3);
        
        sc.close();
    }
}
