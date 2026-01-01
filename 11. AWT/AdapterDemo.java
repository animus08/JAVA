import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame {

    Label l;

    public AdapterDemo() {

        super("Adapter Class Demo");

        // Create Label
        l = new Label("Move or Click the Mouse", Label.CENTER);

        // Layout
        setLayout(new BorderLayout());
        add(l, BorderLayout.CENTER);

        // Add listeners to LABEL
        l.addMouseListener(new MyMouse());
        l.addMouseMotionListener(new MyMotion());

        // Frame settings
        setSize(400, 200);
        setVisible(true);
    }

    // MouseAdapter for click
    class MyMouse extends MouseAdapter {
        public void mouseClicked(MouseEvent me) {
            l.setText("Mouse Clicked at X=" + me.getX() + ", Y=" + me.getY());
        }
    }

    // MouseMotionAdapter for movement
    class MyMotion extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent me) {
            l.setText("Mouse Moved at X=" + me.getX() + ", Y=" + me.getY());
        }
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }
}