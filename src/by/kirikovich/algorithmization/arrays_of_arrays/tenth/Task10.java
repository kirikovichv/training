package by.kirikovich.algorithmization.arrays_of_arrays.tenth;

import java.util.Scanner;

public class Task10 {
    private final Scanner readBuffer = new Scanner(System.in);

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

    public void printPositiveElementsOnDiagonal(int[][] matrix) {
        System.out.print("Positive elements:");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(" " + matrix[i][i]);
            }
        }
        System.out.println();
    }

    public void doYourJob() {
        System.out.print("Enter matrix size NxN: ");
        int n = readBuffer.nextInt();
        int[][] matrix = readMatrix(n, n);
        System.out.println();
        printPositiveElementsOnDiagonal(matrix);
    }
}
