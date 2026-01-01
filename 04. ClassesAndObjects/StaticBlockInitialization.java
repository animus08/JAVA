class StaticBlockInitialization {
    static int initialValue;

    static {
        initialValue = 1000;
        System.out.println("Static block executed. initialValue = " + initialValue);
    }

    public static void main(String[] args) {

        System.out.println("Before creating object: initialValue = " + initialValue);

        StaticBlockInitialization obj = new StaticBlockInitialization();

        System.out.println("After creating object: initialValue = " + initialValue);
    }
}
