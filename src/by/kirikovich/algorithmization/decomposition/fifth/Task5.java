package by.kirikovich.algorithmization.decomposition.fifth;

import java.util.Scanner;

public class Task5 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[] readArray(int n) {
        int[] array = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            array[i] = readBuffer.nextInt();
        }
        return array;
    }

    public int getPreMaxValue(int[] array) {
        int preMaxValue = Integer.MIN_VALUE;
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                preMaxValue = maxValue;
                maxValue = array[i];
            }
        }
        return preMaxValue;
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int n = readBuffer.nextInt();
        int[] array = readArray(n);
        System.out.println(getPreMaxValue(array));
    }
}
