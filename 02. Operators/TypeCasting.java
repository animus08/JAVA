public class TypeCasting{
    public static void main(String [] args){
        int a = 10;
        double b = a; // implicit casting
        System.out.println("Implicit casting from int to double: " + b);

        double c = 9.78;
        int d = (int) c; // explicit casting
        System.out.println("Explicit casting from double to int: " + d);
    }
}
