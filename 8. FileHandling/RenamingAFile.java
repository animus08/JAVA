import java.io.*;
public class RenamingAFile {
    public static void main(String[] args) {
        File of = new File("Modani.txt");
        File nf = new File("Anuj.txt");
        if(of.exists()){
            System.out.print(of.renameTo(nf));
            System.out.println("\nFile Renamed Successfully.");
        }
        else{
            System.out.println("The file does not exist.");
        }
    }
}
