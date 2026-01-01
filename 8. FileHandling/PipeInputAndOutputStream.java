
import java.io.*;
public class PipeInputAndOutputStream {
    public static void main(String[] args) throws Exception {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        // pos.connect(pis);  // Already connected in constructor

        Thread t1 = new Thread(){
            public void run(){
                try{
                    for(int i = 50; i <= 60; i++){
                        pos.write(i);
                        System.out.println("Writing data: " + i);
                        Thread.sleep(500);
                    }
                    pos.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                try{
                    int i;
                    while((i = pis.read()) != -1){
                        System.out.println("Reading data: " + i);
                    }
                    pis.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        };

        t1.start();
        t2.start();
    }
}