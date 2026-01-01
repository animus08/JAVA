import java.awt.*;

public class AWTUIElements {

    public static void main(String[] args) {

        Frame f = new Frame("Basic AWT");

        Label l = new Label("Name:");
        TextField t = new TextField(20);
        Button b = new Button("Submit");

        f.setLayout(new FlowLayout());

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(600, 600);
        f.setVisible(true);
    }
}

