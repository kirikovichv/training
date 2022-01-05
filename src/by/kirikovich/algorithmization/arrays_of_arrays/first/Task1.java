package by.kirikovich.algorithmization.arrays_of_arrays.first;

import java.util.Scanner;

public class Task1 {
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
        System.out.print("Enter n: ");
        int matrixSize = readBuffer.nextInt();
        System.out.println("Enter matrix n*n:");
        int[][] matrix = readMatrix(matrixSize);
        for (int i = 0; i < matrix.length; i++) {
            if ((i + 1) % 2 != 0) {
                if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
