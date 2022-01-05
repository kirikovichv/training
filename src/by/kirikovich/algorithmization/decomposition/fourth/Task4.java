package by.kirikovich.algorithmization.decomposition.fourth;

import java.util.Scanner;

public class Task4 {
    private final Scanner readBuffer = new Scanner(System.in);
    private final byte x = 0;
    private final byte y = 1;

    public void readPointsCoordinates(int[][] array) {
        int n = array[0].length;
        System.out.println("Enter x y coordinates for " + n + " points");
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = readBuffer.nextInt();
            array[x][i] = tmp;
            tmp = readBuffer.nextInt();
            array[y][i] = tmp;
        }
    }

    public double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2d) + Math.pow(Math.abs(y1 - y2), 2d));
    }

    public void printMaxDistance(int[][] array) {
        double maxDistance = 0;
        double distance = 0;
        int index1 = 0;
        int index2 = 0;
        int n = array[0].length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                distance = calculateDistance(array[x][i], array[y][i], array[x][j], array[y][j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Max distance is " + maxDistance + " between " + index1 + " and " + index2 + " points");
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int n = readBuffer.nextInt();
        int[][] array = new int[2][n];
        readPointsCoordinates(array);
        printMaxDistance(array);
    }
}
