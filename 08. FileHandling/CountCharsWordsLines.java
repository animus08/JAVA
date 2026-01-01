// Write a Java program to count the number of characters, words, 
// and lines in a text file (data.txt) using BufferedReader. 

import java.io.*;
public class CountCharsWordsLines {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Assignments\\data.txt"));

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        String line;
        while ((line = br.readLine()) != null) {
            lineCount++;    // Count lines
            charCount += line.length(); // Count characters
            wordCount += line.trim().split("\\s+").length;  // Split by whitespace
        }

        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);

        br.close();
    }
}