public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            int d = 10 / 5;
            System.out.println("Result: " + d);
            try {
                System.out.println("Inner try block");
                int a = 5, b = 0, c;
                c = a / b;
                System.out.println("Result: " + c);
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero is not allowed." + e);
            }
        } 
        catch (Exception e) {
            System.out.println("Outer catch: An error occurred." + e);
        }
        System.out.println("Program continues after nested try-catch blocks.");
    }
}
