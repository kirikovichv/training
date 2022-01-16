package by.kirikovich.algorithmization.arrays_of_arrays.nineth;

import java.util.Scanner;

public class Task9 {
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

    public int getIndexColumnWithMaxSum(int[][] matrix) {
        int index = 0;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
            sum = 0;
        }
        return index;
    }

    public void doYourJob() {
        System.out.print("Enter matrix size m n: ");
        int m = readBuffer.nextInt();
        int n = readBuffer.nextInt();
        int[][] matrix = readMatrix(m, n);
        System.out.println();
        System.out.println("The maximal sum in column: " + getIndexColumnWithMaxSum(matrix));
    }
}
