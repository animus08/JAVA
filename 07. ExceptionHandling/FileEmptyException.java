// Write a Java program that reads a file and throws an exception if the file is empty.

import java.io.*;

public class FileEmptyException {
    public static void main(String[] args) {
        try {
            File f = new File("Assignments\\data.txt");

            if (!f.exists()) {
                throw new Exception("File not found");
            }

            if (f.length() == 0) {
                throw new Exception("File is empty");
            }

            System.out.println("File is not empty");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// import java.io.*;
// class EmptyFileException extends Exception {
// public EmptyFileException(String message) {
// super(message);
// }
// }
// public class Assignment3SectionBQ1{
// public static void main(String[] args){
// try{
// File file = new File("file.txt");
// if(!file.exists()){
// throw new EmptyFileException("file not found");
// }
// else{
// System.out.println("File is not empty");
// }
// }
// catch(EmptyFileException e){
// System.out.println("Error: " + e.getMessage());
// }
// }
// }
