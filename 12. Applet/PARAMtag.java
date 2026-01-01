import java.applet.*;
import java.awt.*;

public class PARAMtag extends Applet{
    String str = null;
    public void init(){
        str = getParameter("name");
    }
    public void paint(Graphics g){
        g.drawString("Welcome " + str, 20, 20);
    }
}
