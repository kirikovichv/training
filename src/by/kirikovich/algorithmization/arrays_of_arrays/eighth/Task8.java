package by.kirikovich.algorithmization.arrays_of_arrays.eighth;

import java.util.Scanner;

public class Task8 {
    private final Scanner readBuffer = new Scanner(System.in);

    public void swapColumns(int[][] matrix, int m, int k) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][m] = matrix[i][m] + matrix[i][k];
            matrix[i][k] = matrix[i][m] - matrix[i][k];
            matrix[i][m] = matrix[i][m] - matrix[i][k];
        }
    }

    public int[][] readMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = readBuffer.nextInt();
            }
        }
        return (matrix);
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void doYourJob() {
        System.out.print("Enter matrix size m n: ");
        int m = readBuffer.nextInt();
        int n = readBuffer.nextInt();
        int[][] matrix = readMatrix(m, n);

        System.out.print("How columns to swap? enter k and l : ");
        int k = readBuffer.nextInt();
        int l = readBuffer.nextInt();

        swapColumns(matrix, k - 1, l - 1);
        printMatrix(matrix);
    }
}
