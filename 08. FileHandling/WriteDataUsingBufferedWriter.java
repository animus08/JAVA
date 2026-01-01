import java.io.*;

public class WriteDataUsingBufferedWriter {
    public static void main(String[] args) {
        // using BufferedWriter
        try {
            FileWriter fw = new FileWriter("myFile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            // We can also write like this-
            // BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
            try {
                bw.write("My name is Anuj");
            } finally {
                bw.close();
                fw.close();
            }
            System.out.println("Successfully wrote to the file using BufferedWriter.");
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }
    }
}
