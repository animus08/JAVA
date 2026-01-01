public class MultipleCatchBlock {
    public static void main(String[] args) {
        int a = 10, b = 0, c = 0;
        int[] arr = {10, 20, 30};
        String str = null;

        try {
            // This will throw ArithmeticException (division by zero)
            c = a / b;
            System.out.println("Result: " + c);

            // This would throw ArrayIndexOutOfBoundsException if reached
            System.out.println("arr[5] = " + arr[5]);

            // This would throw NullPointerException if reached
            System.out.println("Upper: " + str.toUpperCase());
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed. " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index is out of bounds. " + e);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: Null reference encountered. " + e);
        }
        catch (Exception e) {
            System.out.println("Exception: An unexpected error occurred. " + e);
        }

        System.out.println("Program continues after multiple catch blocks.");
    }
}
