// Write an AWT GUI application (called AWTCounter) as shown in the Figure. Each time 
// the "Count" button is clicked, the counter value shall increase by 1.

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener {
    Label l;
    TextField tf;
    Button b;
    int count = 0;

    public AWTCounter() {

        // Create components
        l = new Label("AWT Counter");
        tf = new TextField("0", 10);
        tf.setEditable(false); // non-editable textfield
        b = new Button("Count");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(l);
        add(tf);
        add(b);

        // Register ActionListener
        b.addActionListener(this);

        // Frame settings
        setSize(300, 150);
        setVisible(true);
    }

    // Button click handling
    public void actionPerformed(ActionEvent ae) {
        count++;
        tf.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new AWTCounter();
    }
}
