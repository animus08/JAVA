import java.awt.*;
import java.awt.event.*;

public class ItemDemo implements ItemListener {

    Frame f;
    Checkbox c;
    Label l;

    public ItemDemo() {
        f = new Frame("ItemListener Demo");
        c = new Checkbox("Java");
        l = new Label("Not Selected");

        f.setLayout(new FlowLayout());
        f.add(c);
        f.add(l);

        c.addItemListener(this);

        f.setSize(300, 150);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (c.getState())
            l.setText("Java Selected");
        else
            l.setText("Java Unselected");
    }

    public static void main(String[] args) {
        new ItemDemo();
    }
}
