public class NestedFinallyBlock {
    public static void main(String[] args) {
        try{
            String a = "Anuj";  
            System.out.println(a.toUpperCase());
        }
        catch(Exception e){
            System.out.println("Error: Null reference encountered." + e);
        }
        finally{
            try{
                int c = 10/0;
                System.out.println("Result: " + c);
            }
            catch(Exception e){
                System.out.println("Error: Division by zero is not allowed." + e);
            }
            finally{
                System.out.println("Execution of nested try-catch-finally block is complete.");
            }
        }
    }   
}
