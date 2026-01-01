public class ThrowAndThrowsCombined {
    public static void validate(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
