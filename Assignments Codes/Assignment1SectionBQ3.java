// Write a Java program to reverse a string.
// Input a string: The quick brown fox
// Reverse string: xof nworb kciuq ehT

public class Assignment1SectionBQ3 {
    public static void main(String[] args) {
        String str = "The quick brown fox";
        String reversedStr = "";

        // Reversing the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("Input string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}