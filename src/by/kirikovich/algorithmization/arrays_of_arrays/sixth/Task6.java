package by.kirikovich.algorithmization.arrays_of_arrays.sixth;

import java.util.Scanner;

public class Task6 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[][] fillMatrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        matrix[matrixSize / 2][matrixSize / 2] = 1;
        for (int i = 0; i < matrixSize / 2; i++) {
            matrix[i][matrixSize / 2] = 1;
            matrix[matrixSize - i - 1][matrixSize / 2] = 1;
            for (int j = 0; j < matrixSize / 2; j++) {
                if (j >= i) {
                    matrix[i][j] = 1;
                    matrix[i][matrixSize - j - 1] = 1;
                    matrix[matrixSize - i - 1][j] = 1;
                    matrix[matrixSize - i - 1][matrixSize - j - 1] = 1;
                } else {
                    matrix[i][j] = 0;
                    matrix[i][matrixSize - j - 1] = 0;
                    matrix[matrixSize - i - 1][j] = 0;
                    matrix[matrixSize - i - 1][matrixSize - j - 1] = 0;
                }
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
        System.out.print("Enter n: ");
        int matrixSize = readBuffer.nextInt();
        int[][] matrix = fillMatrix(matrixSize);
        printMatrix(matrix);
    }
}
