package by.kirikovich.algorithmization.arrays_of_arrays.seventh;

import java.util.Scanner;

public class Task7 {
    private final Scanner readBuffer = new Scanner(System.in);

    public double[][] fillMatrix(int matrixSize) {
        double[][] matrix = new double[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / matrixSize);
            }
        }
        return (matrix);
    }

    public void printMatrix(double[][] matrix) {
        int aboveZeroCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > 0) {
                    aboveZeroCounter++;
                }
            }
            System.out.println();
        }
        System.out.println(aboveZeroCounter);
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int matrixSize = readBuffer.nextInt();
        double[][] matrix = fillMatrix(matrixSize);
        printMatrix(matrix);
    }
}
