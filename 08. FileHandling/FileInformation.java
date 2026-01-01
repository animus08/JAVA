import java.io.*;
public class FileInformation {
    public static void main(String[] args) {
        File f = new File("myFile.txt");
        if(f.exists()){
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
            // If wants tod delete the file after the execution then-
            // System.out.println("Deleting the file: " + f.delete());

        }
        else{
            System.out.println("The file does not exist.");
        }
    }
}