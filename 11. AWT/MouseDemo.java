import java.awt.*;
import java.awt.event.*;

public class MouseDemo implements MouseListener {

    Frame f;
    Label l;

    public MouseDemo() {
        f = new Frame("MouseListener Demo");
        l = new Label("Click inside window");

        f.setLayout(new FlowLayout());
        f.add(l);

        f.addMouseListener(this);

        f.setSize(300, 150);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}
