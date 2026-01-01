// Create a custom exception class called InvalidAgeException. Write a program that takes a 
// user's age as input and throws the InvalidAgeException if the age is less than 18. 
// The program should display an appropriate message when the exception is caught.

class InvalidAgeException extends Exception{
    public InvalidAgeException (String msg){
        super(msg);
    }
}

public class InvalidAge {
    static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args){
        int age = 15;
        try{
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
