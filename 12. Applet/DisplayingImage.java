import java.applet.*;
import java.awt.*;
public class DisplayingImage extends Applet{
    Image img;
    public void init(){
        img = getImage(getDocumentBase(), "java.jpg");
    }
    public void paint(Graphics g){
        g.drawImage(img, 10, 10, this); 
        // this method draws the image at coordinates (10,10)
    }
    // public void paint(Graphics g) {
    //     g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    // }
}
