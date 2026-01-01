// // Write a Java applet(called AWTAccumulatorApplet) which contains:
// // 1. A label "Enter an integer: "
// // 2. TextField for user to enter a number.

// import java.applet.*;
// import java.awt.*;

// public class Assignment5SectionCQ2 extends Applet {

//     Label l;
//     TextField t;

//     public void init() {

//         l = new Label("Enter an integer:");   // 1. A label
//         t = new TextField(10);             // 2. TextField  for user to enter a number.

//         add(l);
//         add(t);
//     }
// }



import java.applet.*;
import java.awt.*;

public class LoginApplet extends Applet {

    Label l1, l2;
    TextField t1, t2;
    Button b;

    public void init() {

        l1 = new Label("Enter the email:"); // 1. A label
        t1 = new TextField(10); // 2. TextField for user to enter a number.
        l2 = new Label("Enter the password:");
        t2 = new TextField(10);
        b = new Button("Login");
        
        // Create panels for each row
        Panel row1 = new Panel();
        row1.add(l1);
        row1.add(t1);
        
        Panel row2 = new Panel();
        row2.add(l2);
        row2.add(t2);
        
        Panel row3 = new Panel();
        row3.add(b);
        
        // Set layout to vertical
        setLayout(new GridLayout(3, 1));
        
        add(row1);
        add(row2);
        add(row3);
    }
}
