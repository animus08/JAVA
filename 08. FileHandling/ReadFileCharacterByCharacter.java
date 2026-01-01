// Write a Java program to read the contents of a text file (input.txt)
//  character by character using FileReader and display it on the console. 

import java.io.*;
public class ReadFileCharacterByCharacter {
    public static void main(String [] args) throws Exception{
        FileReader fr = new FileReader("Assignments\\data.txt");
        int i;
        
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }

        fr.close();
    }
}
