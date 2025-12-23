// Write a Java program to demonstrate the use of the this keyword. Create a class Student 
// including the attributes as:  name (String)  and age (int) 
// The class should include: 
// 1. A constructor that uses the this keyword to initialize the attributes. 
// 2. A method displayDetails() that prints the student's name and age using the this keyword.

class Student {
    String name;
    int age;

    // Constructor that uses 'this' keyword to initialize attributes
    Student(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
        this.age = age;   // 'this.age' refers to the instance variable, 'age' refers to the parameter
    }

    // Method to display student details using 'this' keyword
    void displayDetails() {
        System.out.println("Student Name: " + this.name); // 'this.name' refers to the instance variable
        System.out.println("Student Age: " + this.age);   // 'this.age' refers to the instance variable
    }
}

public class Assignment2SectionCQ2 {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Anuj", 21);
        
        // Displaying student details
        student.displayDetails();
    }
}