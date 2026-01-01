// Write a Java program to create a method that takes a string as input 
// and throws an exception if the string does not contain vowels. 

import java.util.*;

class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class NoVowel {
    static void checkVowel(String str) throws NoVowelException {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    return;
            }
        }
        throw new NoVowelException("No vowels found in the string");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        try {
            checkVowel(input);
            System.out.println("String contains vowels");
        } catch (NoVowelException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

// We can also use this thing in place of for loop
// static void checkVowel(String str) throws NoVowelException {
//     if(!str.matches(".*[aeiouAEIOU].*")){
//         throw new NoVowelException("No vowels found in the string");
//     }
// }