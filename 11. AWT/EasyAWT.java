import java.awt.*;

public class EasyAWT {

    public static void main(String[] args) {

        // 1️⃣ Create Frame (window)
        Frame f = new Frame("Easy AWT Example");

        // 2️⃣ Create a Button
        Button b = new Button("Click Me");

        // 3️⃣ add(Component c)
        f.add(b);

        // 4️⃣ setLayout(LayoutManager m)
        f.setLayout(new FlowLayout());

        // 5️⃣ setSize(int width, int height)
        f.setSize(300, 200);

        // 6️⃣ setVisible(boolean status)
        f.setVisible(true);
    }
}
