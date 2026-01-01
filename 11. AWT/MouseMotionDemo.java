import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo implements MouseMotionListener {

    Frame f;
    Label l;

    public MouseMotionDemo() {
        f = new Frame("MouseMotion Demo");
        l = new Label("Move mouse");

        f.setLayout(new FlowLayout());
        f.add(l);

        f.addMouseMotionListener(this);

        f.setSize(300, 150);
        f.setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved");
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");
    }

    public static void main(String[] args) {
        new MouseMotionDemo();
    }
}
