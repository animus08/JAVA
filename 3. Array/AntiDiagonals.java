// Write a Java program to create an array of its anti-diagonals from a given square matrix.
// Input : 1 2          Output: [1],
//         3 4                  [2, 3],
//                              [4]

public class AntiDiagonals {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2 },
                { 3, 4 }
        };

        int n = matrix.length;

        // There will be (2*n - 1) anti-diagonals
        for (int d = 0; d < 2 * n - 1; d++) {
            System.out.print("[");

            for (int i = 0; i < n; i++) {
                int j = d - i;

                if (j >= 0 && j < n) {
                    System.out.print(matrix[i][j]);

                    if (i + 1 < n && d - (i + 1) >= 0 && d - (i + 1) < n) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println("]");
        }
    }
}