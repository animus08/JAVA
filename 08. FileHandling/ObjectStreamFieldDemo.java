// Write Java program to illustrate the working of the Java IO ObjectStreamField class

import java.io.*;
public class ObjectStreamFieldDemo {
    public static void main(String[] args) {

        // Create ObjectStreamField objects
        ObjectStreamField f1 = new ObjectStreamField("id", int.class);
        ObjectStreamField f2 = new ObjectStreamField("name", String.class);

        // Display field information
        System.out.println("Field Name: " + f1.getName());
        System.out.println("Field Type: " + f1.getType());

        System.out.println("Field Name: " + f2.getName());
        System.out.println("Field Type: " + f2.getType());
    }
}
