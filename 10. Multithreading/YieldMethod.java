class Thread1 extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name);
                Thread.yield(); // asking CPU to switch to another thread
                Thread.sleep(1000);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
