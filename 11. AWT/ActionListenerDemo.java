import java.awt.*;
import java.awt.event.*;

public class ActionListenerDemo implements ActionListener {

    Frame f;
    Button b;
    TextField tf1, tf2;

    public ActionListenerDemo() {

        // Create Frame
        f = new Frame("ActionListener Example");

        // Create TextFields
        tf1 = new TextField(20); // input
        tf2 = new TextField(20); // output
        tf2.setEditable(false);

        // Create Button
        b = new Button("Click");

        // Set Layout
        f.setLayout(new FlowLayout());

        // Add Components
        f.add(tf1);
        f.add(b);
        f.add(tf2);

        // Register ActionListener
        b.addActionListener(this);

        // Frame settings
        f.setSize(300, 150);
        f.setVisible(true);
    }

    // ActionListener method
    public void actionPerformed(ActionEvent ae) {
        String msg = tf1.getText(); // getText()
        tf2.setText(msg); // setText()
    }

    public static void main(String[] args) {
        new ActionListenerDemo();
    }
}