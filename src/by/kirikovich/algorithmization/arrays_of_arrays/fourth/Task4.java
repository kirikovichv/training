package by.kirikovich.algorithmization.arrays_of_arrays.fourth;

import java.util.Scanner;

public class Task4 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[][] fillMatrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = matrixSize - j;
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
