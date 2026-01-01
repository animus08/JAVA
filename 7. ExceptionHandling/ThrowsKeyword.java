public class ThrowsKeyword {
    // Demonstrate 'throws' by declaring a checked exception
    static void checkAge(int age) throws Exception {
        if (age < 18) throw new Exception("Age must be at least 18.");
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) throws Exception {
        checkAge(15); // will throw and the JVM prints stacktrace
    }
}