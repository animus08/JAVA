// Write a Java program that reads a list of numbers from a file 
// and throws an exception if any of the numbers are positive.

import java.io.*;
import java.util.*;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String msg) {
        super(msg);
    }
}

public class PositiveNumber {

    static void checkPositiveNumbers(File file) throws PositiveNumberException, FileNotFoundException {

        Scanner sc = new Scanner(file);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > 0) {
                sc.close();
                throw new PositiveNumberException("Positive number found: " + num);
            }
        }
        sc.close();
        System.out.println("No positive numbers found");
    }

    public static void main(String[] args) {
        try {
            File file = new File("Assignments\\Assign3CQ3Numbers.txt");     
            checkPositiveNumbers(file);
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } 
        catch (PositiveNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
// Imp- File should contain the numbers in separate lines or spaces, not together or separated by commas.



// class PositiveNumberException extends Exception{
// public PositiveNumberException(String msg){
// super(msg);
// }
// }

// public class Assignment3SectionCQ3 {
// static void checkPositiveNumbers(int[] numbers) throws
// PositiveNumberException{
// for(int i = 0; i < numbers.length; i++){
// if(numbers[i] > 0){
// throw new PositiveNumberException("Positive number found: " + numbers[i]);
// }
// }
// System.out.println("No positive numbers found");
// }

// public static void main(String [] args){
// int [] numbers = {-5, -10, -3, -1, 7};
// try{
// checkPositiveNumbers(numbers);
// }
// catch(PositiveNumberException e){
// System.out.println("Error: " + e.getMessage());
// }
// }
// }