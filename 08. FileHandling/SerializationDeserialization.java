// Write a Java program to implement Serialization and Deserialization concept.
import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}   

public class SerializationDeserialization {
    public static void main(String[] args) {
        try {
            // Serialization
            Student student1 = new Student(1, "Anuj");

            FileOutputStream fos = new FileOutputStream("Assignments\\student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student1);
            
            oos.close();
            fos.close();

            System.out.println("Serialization completed.");

            // Deserialization
            FileInputStream fis = new FileInputStream("Assignments\\student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student deserializedStudent = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialization completed.");
            System.out.println("Student ID: " + deserializedStudent.id);
            System.out.println("Student Name: " + deserializedStudent.name);

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
