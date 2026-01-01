import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="ColourUsingScrollbar.class" width=400 height=250 ></applet> */
public class ColourUsingScrollbar extends Applet implements AdjustmentListener {
    Scrollbar red, green, blue;
    Label l1, l2, l3;
    Color col = Color.pink;
    int r, g, b;

    public void init() {
        setBackground(Color.white);
        l1 = new Label("Red");
        l2 = new Label("Green");
        l3 = new Label("Blue");
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
        setLayout(new FlowLayout());
        add(l1);
        add(red);
        add(l2);
        add(green);
        add(l3);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        r = red.getValue();
        g = green.getValue();
        b = blue.getValue();
        col = new Color(r, g, b);
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(col);
        g.fillRect(150, 100, 100, 70);
        showStatus("Adjust the Scroll bars to change the color of the Rectangle");
    }
}