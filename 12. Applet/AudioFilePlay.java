import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AudioFilePlay extends Applet implements ActionListener{
    Button play, stop;
    AudioClip ac;
    public void init(){
        play = new Button("Play");
        stop = new Button("Stop");
        add(play);
        add(stop);
        play.addActionListener(this);
        stop.addActionListener(this);
        ac = getAudioClip(getCodeBase(), "song.wav");
    }

    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        if(str.equals("Play")){
            ac.play();
        }
        else if(str.equals("Stop")){
            ac.stop();
        }
    }    
}
