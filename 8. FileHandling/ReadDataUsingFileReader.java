import java.io.*;
public class ReadDataUsingFileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("myFile.txt");
            try {
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fr.close();
                System.out.println("\nFile Read Succesfully using FileReader.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }
    }
}