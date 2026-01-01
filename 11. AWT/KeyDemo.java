import java.awt.*;
import java.awt.event.*;

public class KeyDemo implements KeyListener {

    Frame f;
    TextField t;
    Label l;

    public KeyDemo() {
        f = new Frame("KeyListener Demo");
        t = new TextField(20);
        l = new Label("Press any key");

        f.setLayout(new FlowLayout());
        f.add(t);
        f.add(l);

        t.addKeyListener(this);

        f.setSize(300, 150);
        f.setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        //l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyDemo();
    }
}
