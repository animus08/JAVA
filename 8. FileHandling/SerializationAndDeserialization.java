import java.io.*;
class A implements Serializable {
    int i;
}

// Serialization and Deserialization of Object

public class SerializationAndDeserialization {
    public static void main(String[] args) throws Exception {
        A a1 = new A();
        a1.i = 10;

        File f =  new File("obj.ser");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        A a2 = (A) ois.readObject(); // downcasting from Object to A
        System.out.println("Value of i: " + a2.i);

        fis.close();
        ois.close();
        fos.close();
        oos.close();
    }
}


// Code for Seprate Serialization and Deserialization processes can also be written.
// Serialization Process
/*
package FileHandling;
import java.io.*;
class A implements Serializable {
    int i;
}
public class Serialization {
    public static void main(String[] args) throws Exception {
        A a1 = new A();
        a1.i = 10;

        File f =  new File("obj.ser");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a1);

        fos.close();
        oos.close();
    }
}
*/
// Deserialization Process
/*
package FileHandling;
import java.io.*;
class A implements Serializable {
    int i;
}
public class Serialization {
    public static void main(String[] args) throws Exception {
        File f =  new File("obj.ser");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        A a2 = (A) ois.readObject(); // downcasting from Object to A
        System.out.println("Value of i: " + a2.i);

        fis.close();
        ois.close();
    }
}
*/
