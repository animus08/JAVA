import java.io.*;
public class WriteDataUsingPrintWriter {
    public static void main(String[] args) {
        // using PrintWriter
        try {
            PrintWriter pw = new PrintWriter("myFile.txt");
            try {
                pw.println("My name is Anuj Modani");
            } finally {
                pw.close();
            }
            System.out.println("Successfully wrote to the file using PrintWriter.");
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }
    }
}
