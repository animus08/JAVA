// Thread class
class A implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Anuj");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class MultiThreadingByImplementingRunnableInterface {
    public static void main(String[] args) throws Exception {
        A r = new A();
        Thread t = new Thread(r);
        t.start();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Modani");
            Thread.sleep(1000);
        }
    }
}