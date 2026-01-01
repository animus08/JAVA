import java.applet.*;
import java.awt.*;
public class Calculator extends Applet{
    TextField t1, t2, t3, t4;
    public void init(){
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t4 = new TextField(10);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
    }

    public void paint(Graphics g){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        char op = t3.getText().charAt(0);
        int result = 0;

        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                g.drawString("Invalid Operator", 20, 100);
                return;
        }
        t4.setText("Result: " + String.valueOf(result));
    }
}