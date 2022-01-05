package by.kirikovich.algorithmization.arrays_of_arrays.fourteenth;

import java.util.Scanner;

public class Task14 {
    private final Scanner readBuffer = new Scanner(System.in);

    public void fillMatrixZeros(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public int[][] fillMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        fillMatrixZeros(matrix);
        for (int i = 0; i < n; i++) {
            int j = 0;
            int counter = 0;
            while (true) {
                j = (int) (Math.random() * m);
                if (matrix[j][i] != 1) {
                    matrix[j][i] = 1;
                    counter++;
                    if (counter == i + 1) {
                        break;
                    }
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
        System.out.println("Enter m anm n: ");
        int m = readBuffer.nextInt();
        int n = readBuffer.nextInt();
        int[][] matrix = fillMatrix(m, n);
        printMatrix(matrix);
    }
}
