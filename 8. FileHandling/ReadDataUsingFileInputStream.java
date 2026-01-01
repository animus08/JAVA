
import java.io.*;
public class ReadDataUsingFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("myFile.txt");
            try {
                int i;
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fis.close();
                System.out.println("\nFile Read Succesfully using FileInputStream.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }
    }
}
