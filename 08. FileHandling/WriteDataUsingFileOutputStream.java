import java.io.*;

public class WriteDataUsingFileOutputStream {
    public static void main(String[] args) {
        // using FileOutputStream
        try {
            FileOutputStream fos = new FileOutputStream("myFile.txt");
            try {
                // String data = "My name is Anuj Modani";
                // byte[] byteArray = data.getBytes();
                // fos.write(byteArray);
                fos.write("My name is Anuj Modani".getBytes()); // Directly writing bytes
            } finally {
                fos.close();
            }
            System.out.println("Successfully wrote to the file using FileOutputStream.");
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }   
    }
}