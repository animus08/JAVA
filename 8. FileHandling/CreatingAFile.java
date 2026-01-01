import java.io.*;
public class CreatingAFile {
    public static void main(String[] args) throws IOException{
        File f = new File("file.txt");
        if(f.createNewFile()){      // if we leave it, it will throw a IOException
            System.out.println("File Created.");
        }
        else{
            System.out.println("File already exists.");
        }
    }
}

// We can also handle the exception using try-catch block
/*
package FileHandling;
import java.io.*;
public class CreatingAFile {
    public static void main(String[] args){
        File f = new File("myfile.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File Created.");
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
*/