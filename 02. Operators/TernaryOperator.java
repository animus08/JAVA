/* Ternary Operator Example... */
class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4, c = 2, Max;
        Max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(Max);
    }
}