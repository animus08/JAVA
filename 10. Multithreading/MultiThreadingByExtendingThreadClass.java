class A extends Thread{
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("Anuj");
                Thread.sleep(1000); // 1000 milliseconds = 1 second
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class MultiThreadingByExtendingThreadClass{

    public static void main(String[] args) throws Exception{
        A t = new A();
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Modani");
            Thread.sleep(1000);
        }
    }
}
