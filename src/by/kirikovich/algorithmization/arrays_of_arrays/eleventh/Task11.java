package by.kirikovich.algorithmization.arrays_of_arrays.eleventh;

import java.util.Scanner;

public class Task11 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[][] fillMatrixRandomValues(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
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

    public void printLines(int[][] matrix) {
        System.out.println();
        for (int i = 1; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                    if (count == 3) {
                        for (int k = 0; k < matrix[i].length; k++) {
                            System.out.print(matrix[i][k] + " ");
                        }
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }

    public void doYourJob() {
        int[][] matrix = fillMatrixRandomValues(10, 20);
        printMatrix(matrix);
        printLines(matrix);
    }
}
