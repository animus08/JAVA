import java.applet.*;
import java.awt.*;
public class InputFromUser extends Applet{
    TextField t1, t2;
    public void init(){
        t1 = new TextField(10);
        t2 = new TextField(10);
        add(t1);
        add(t2);
    }
    public void paint(Graphics g){
        int sq = 0; 
        sq = Integer.parseInt(t1.getText());    // convert string to integer
        sq = sq * sq;
        g.drawString("Square is: " + sq, 20, 60);
        t2.setText(String.valueOf(sq)); // convert integer to string and set in textfield
    }
}
