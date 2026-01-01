public class NestedCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            int d = 10 / 0;
            System.out.println("Result: " + d);
        } 
        catch (ArithmeticException e) {
            System.out.println("Outer catch: Division by zero is not allowed." + e);
            try {
                System.out.println("Inner try block in catch");
                String str = null;
                System.out.println(str.length());
            } 
            catch (NullPointerException ne) {
                System.out.println("Inner catch: Null pointer exception occurred." + ne);
            }
        }
    }
}
