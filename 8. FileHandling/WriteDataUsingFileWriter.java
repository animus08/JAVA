import java.io.*;

public class WriteDataUsingFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("myFile.txt");   // Create a FileWriter object
            try{
                fw.write("My name is Anuj Modani");
            }
            finally{
                fw.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
        }
    }
}