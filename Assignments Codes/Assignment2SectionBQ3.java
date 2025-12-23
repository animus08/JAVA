// Write a Java program to create a class called "Initializer" with a static block 
// that initializes  a static variable 'initialValue' to 1000. Print the value 
// of 'initialValue' before and after creating an  instance of "Initializer".

class Assignment2SectionBQ3 {       // change class name to Initializer for the task
    static int initialValue;

    // Static block
    static {
        initialValue = 1000;
        System.out.println("Static block executed. initialValue = " + initialValue);
    }

    public static void main(String[] args) {

        // Before creating object
        System.out.println("Before creating object: initialValue = " + initialValue);

        // Creating object
        Assignment2SectionBQ3 obj = new Assignment2SectionBQ3();

        // After creating object
        System.out.println("After creating object: initialValue = " + initialValue);
    }
}