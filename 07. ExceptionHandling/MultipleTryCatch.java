public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            int c = 10/0;
            System.out.println("Result: " + c);
        }
        catch(Exception e){
            System.out.println("Error: Division by zero is not allowed." + e);
        }
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(Exception e){
            System.out.println("Error: Null reference encountered." + e);
        }
    }
}
