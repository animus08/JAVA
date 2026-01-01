public class StringReversal {
    public static void main(String[] args) {
        String str = "The quick brown fox";
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("Input string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
