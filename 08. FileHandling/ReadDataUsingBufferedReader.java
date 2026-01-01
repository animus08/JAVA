
import java.io.*;
public class ReadDataUsingBufferedReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("myFile.txt");
            BufferedReader br = new BufferedReader(fr);
            // We can also read like this-
            // BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));
            try {
                String line;
                while ((line = br.readLine()) != null) { // readLine() reads a line of text
                    System.out.println(line);
                }
            } finally {
                br.close();
                fr.close();
                System.out.println("\nFile Read Succesfully using BufferedReader.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }
    }
}
