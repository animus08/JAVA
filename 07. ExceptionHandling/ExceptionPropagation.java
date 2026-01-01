public class ExceptionPropagation {
    void m1() {
        int x = 5 / 0;  // Exception here
    }

    void m2() {
        m1();  // m1 did not handle it → propagates
    }

    void m3() {
        try {
            m2();  // exception finally caught here
        } catch(Exception e) {
            System.out.println("Handled");
        }
    }

    public static void main(String args[]) {
        new ExceptionPropagation().m3();
    }
}
