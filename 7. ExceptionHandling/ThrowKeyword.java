public class ThrowKeyword {
    void validate(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        ThrowKeyword obj = new ThrowKeyword();
        try{
            obj.validate(15);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
