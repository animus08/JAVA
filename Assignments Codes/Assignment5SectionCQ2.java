// Write a Java applet(called AWTAccumulatorApplet) which contains:
// 1. A label "Enter an integer: "
// 2. TextField for user to enter a number.

import java.applet.*;
import java.awt.*;

public class Assignment5SectionCQ2 extends Applet {

    Label l;
    TextField t;

    public void init() {

        l = new Label("Enter an integer:");   // 1. A label
        t = new TextField(10);             // 2. TextField  for user to enter a number.

        add(l);
        add(t);
    }
}
