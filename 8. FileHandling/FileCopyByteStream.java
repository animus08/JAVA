// Write Java Program illustrating the Byte Stream to 
// copy contents of one file to another file using FileStream. 

import java.io.*;
public class FileCopyByteStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Assignments\\source.txt");
        FileOutputStream fos = new FileOutputStream("Assignments\\destination.txt");

        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }

        fis.close();
        fos.close();
    }   
}
