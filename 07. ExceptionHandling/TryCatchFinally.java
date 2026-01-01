public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Attempting division...");
            int a = 5, b = 0, c;
            c = a / b;
            System.out.println("Result: " + c);
        } 
        catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed." + e);
        }
        finally{
            System.out.println("Execution of try-catch block is complete.");
        }
        System.out.println("Program continues after try-catch-finally block.");
    }
}
