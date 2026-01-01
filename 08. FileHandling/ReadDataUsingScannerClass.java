import java.io.*;
import java.util.*;
public class ReadDataUsingScannerClass {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            Scanner sc = new Scanner(file);
            try {
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
            } finally {
                sc.close();
                System.out.println("File Read Succesfully using Scanner Class.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }
    }
}
