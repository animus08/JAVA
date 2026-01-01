import java.applet.*;
import java.awt.*;
public class StringConcatenates extends Applet{
    String str1, str2, str3;
    public void init(){
        str1 = getParameter("str1");
        str2 = getParameter("str2");
        str3 = str1 + " " + str2;
    }
    public void paint(Graphics g){
        g.drawString(str3, 20, 20);
    }
}
