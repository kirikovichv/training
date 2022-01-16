package by.kirikovich.algorithmization.arrays_of_arrays.fifteenth;

import java.util.Scanner;

public class Task15 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[][] fillMatrixRandomValues(int m, int n) {
        int maxValue = 1000;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * maxValue + 1);
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

    public int findMaxElement(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    public void changeElements(int[][] matrix, int changeElement) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    matrix[i][j] = changeElement;
                }
            }
        }
    }

    public void doYourJob() {
        System.out.println("Enter m n: ");
        int m = readBuffer.nextInt();
        int n = readBuffer.nextInt();
        int[][] matrix = fillMatrixRandomValues(m, n);
        printMatrix(matrix);
        int maxElement = findMaxElement(matrix);
        changeElements(matrix, maxElement);
        printMatrix(matrix);
    }
}
