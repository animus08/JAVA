// Create two thread. One print “Great” and other print “Achievement”

public class PrintWordsThreads {
    public static void main(String [] args){
        Thread t1 = new Thread(){
            public void run(){
                try{
                    for(int i=1; i<=5; i++){
                        System.out.println("Great");
                        Thread.sleep(1000);
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                try{
                    for(int i=1; i<=5; i++){
                        System.out.println("Achievement");
                        Thread.sleep(1000);
                    }
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
