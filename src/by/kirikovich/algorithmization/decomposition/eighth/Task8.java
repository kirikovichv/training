package by.kirikovich.algorithmization.decomposition.eighth;

import java.util.Scanner;

public class Task8 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[] readArray(int n) {
        int[] array = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            array[i] = readBuffer.nextInt();
        }
        return array;
    }

    public int getSums(int[] array, int k) {
        return array[k] + array[k + 1] + array[k + 2];
    }

    public void printSums(int[] array, int k, int m) {
        if ((m > array.length) || (k > m)) {
            System.out.println("Data is not correct");
            return;
        }
        for (; k <= m - 2; k++) {
            System.out.println(getSums(array, k - 1));
        }
    }

    public void doYourJob() {
        System.out.print("Enter n, k, m: ");
        int n = readBuffer.nextInt();
        int k = readBuffer.nextInt();
        int m = readBuffer.nextInt();
        int[] array = readArray(n);
        printSums(array, k, m);
    }
}
