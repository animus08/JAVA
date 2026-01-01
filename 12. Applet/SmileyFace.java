import java.applet.*;
import java.awt.*;
public class SmileyFace extends Applet{
    public void paint(Graphics g) {
        // Draw face outline
        // g.setColor(Color.YELLOW);
        // g.fillOval(50, 50, 200, 200);
        // g.setColor(Color.BLACK);
        g.drawOval(50, 50, 200, 200);

        // Draw eyes
        // g.setColor(Color.BLACK);
        g.fillOval(90, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);

        // Draw nose
        g.drawLine(150, 130, 150, 170);

        // Draw mouth
        g.drawArc(100, 150, 100, 70, 0, -180);
    }
}