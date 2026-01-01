/* Applet to draw a bar chart */
import java.applet.*;
import java.awt.*;

public class DrawBarChart extends Applet {
    int n = 0;
    String label[];
    int value[];

    public void init() {
        try {
            n = Integer.parseInt(getParameter("columns"));
            label = new String[n];
            value = new int[n];
            label[0] = getParameter("label1");
            label[1] = getParameter("label2");
            label[2] = getParameter("label3");
            label[3] = getParameter("label4");
            value[0] = Integer.parseInt(getParameter("m1"));
            value[1] = Integer.parseInt(getParameter("m2"));
            value[2] = Integer.parseInt(getParameter("m3"));
            value[3] = Integer.parseInt(getParameter("m4"));
        } 
        catch (NumberFormatException e) {
        }
    }

    public void paint(Graphics g) {
        String msg = label[0];
        for (int i = 0; i < n; i++) {
            {
                g.setColor(Color.red);
                g.drawLine(100, 50, 100, 350);
                g.drawLine(100, 350, 300, 350);
                g.setColor(Color.blue);
                g.drawString(label[i], 40, 145 + (50 * i));
                g.setColor(Color.green);
                g.fillRect(100, 125 + (50 * i), value[i], 30);
                showStatus("Bar chart Applet");
            }
        }
    }
}