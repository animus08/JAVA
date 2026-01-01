import java.util.*;
public class UpperCaseToLoweCaseAndViceVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                char lowerCh = Character.toLowerCase(ch);
                System.out.print(lowerCh);
            }
            else if(Character.isLowerCase(ch)){
                char upperCh = Character.toUpperCase(ch);
                System.out.print(upperCh);
            }
            else{
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
