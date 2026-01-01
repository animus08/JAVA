import java.awt.*;
import java.awt.event.*;

public class ActionDemo implements ActionListener {

    Frame f;
    Button b;
    Label l;

    public ActionDemo() {
        f = new Frame("ActionListener Demo");
        b = new Button("Click");
        l = new Label("Button not clicked");

        f.setLayout(new FlowLayout());
        f.add(b);
        f.add(l);

        b.addActionListener(this);

        f.setSize(300, 150);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        l.setText(str);
    }

    public static void main(String[] args) {
        new ActionDemo();
    }
}