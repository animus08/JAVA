// Basic AWT Example
import java.awt.*;
import java.awt.event.*;

public class BasicAWT {

    public static void main(String[] args) {
        Frame frame = new Frame("Basic AWT Example");

        Button button = new Button("Click Me");
        Label label = new Label("Button not clicked");

        frame.setLayout(new BorderLayout());
        frame.add(button, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        button.addActionListener(e -> label.setText("Button Clicked!"));

        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}