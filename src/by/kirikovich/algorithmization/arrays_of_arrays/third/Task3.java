package by.kirikovich.algorithmization.arrays_of_arrays.third;

import java.util.Scanner;

public class Task3 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[][] readMatrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
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
        System.out.print("Enter n, k, p: ");
        int matrixSize = readBuffer.nextInt();
        int k = readBuffer.nextInt();
        int p = readBuffer.nextInt();
        System.out.println("Enter matrix n*n:");
        int[][] matrix = readMatrix(matrixSize);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][p - 1] + " ");
        }
    }
}
