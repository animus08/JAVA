import java.io.*;
public class CopyOneFileContentToAnother {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("myFile.txt");
        FileOutputStream fos = new FileOutputStream("myFileCopy.txt");

        int i;
        while((i = fis.read()) != -1){
            fos.write(i);
        }
        System.out.println("File Content Copied Successfully.");
    }
}

// ------------------If we want to copy using Buffered Streams then- ----------------
/*
package FileHandling;
import java.io.*;
public class CopyOneFileContentToAnother {
    public static void main(String[] args) throws Exception{
        BufferedReader bis = new BufferedReader(new FileReader("myFile.txt"));
        BufferedWriter bos = new BufferedWriter(new FileWriter("myFileCopy.txt"));
        String i;
        while((i = bis.readLine()) != null){
            bos.write(i);
        }
        bis.close();
        bos.close();
        System.out.println("File Content Copied Successfully using Buffered Streams.");
    }
}
*/