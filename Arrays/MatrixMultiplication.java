package Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Pre-initialized 3x3 matrices
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Resultant matrix
        int[][] result = new int[3][3];

        // Matrix multiplication logic
        for (int i = 0; i < 3; i++) {            // Row of matrix1
            for (int j = 0; j < 3; j++) {        // Column of matrix2
                for (int k = 0; k < 3; k++) {    // Multiplying and adding
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Product of the two 3x3 matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
