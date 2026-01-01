import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletCombineAWT extends Applet implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b;

    public void init() {

        // Create components
        l1 = new Label("Enter an integer:");
        l2 = new Label("Square is:");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t2.setEditable(false);      // make output field non-editable

        b = new Button("Square");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(t2);
        // Register listener
        b.addActionListener(this);
    }

    // Button click handling
    public void actionPerformed(ActionEvent ae) {
        int num = Integer.parseInt(t1.getText());
        int square = num * num;
        t2.setText(String.valueOf(square));
    }
}
