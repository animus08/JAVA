interface InterfaceA {
    void methodA();
}
interface InterfaceB {
    void methodB();
}
class MultipleInterface implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }
    public void methodB() {
        System.out.println("Method B from Interface B");
    }
    public static void main(String[] args) {
        MultipleInterface obj = new MultipleInterface();
        obj.methodA();
        obj.methodB();
    }
}
