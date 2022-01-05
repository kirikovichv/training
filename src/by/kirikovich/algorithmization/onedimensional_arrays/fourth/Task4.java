package by.kirikovich.algorithmization.onedimensional_arrays.fourth;

import java.util.Scanner;

public class Task4 {
    public void doYourJob() {
        System.out.print("Enter n: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        System.out.print("Enter array elements: ");
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        int indexMaxEl = 0, indexMinEl = 0;
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
            if (array[i] > maxElement) {
                maxElement = array[i];
                indexMaxEl = i;
            }
            if (array[i] < minElement) {
                minElement = array[i];
                indexMinEl = i;
            }
        }
        array[indexMinEl] = maxElement;
        array[indexMaxEl] = minElement;
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
