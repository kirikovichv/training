package by.kirikovich.algorithmization.arrays_of_arrays.tvelvth;

import java.util.Scanner;

public class Task12 {
    private Scanner readBuffer = new Scanner(System.in);

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

    public void printMatrixReverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int matrixSize = readBuffer.nextInt();
        System.out.println("Enter matrix n*n:");
        int[][] matrix = readMatrix(matrixSize);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        int buffer = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = buffer;
                    }
                }
            }
        }
        printMatrix(matrix);
        printMatrixReverse(matrix);
    }
}
