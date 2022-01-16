package by.kirikovich.algorithmization.sortings.third;

import java.util.Scanner;

public class Task3 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[] readArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = readBuffer.nextInt();
        }
        return (array);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void selectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int maxInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] > array[maxInd]) {
                    maxInd = i;
                }
            }
            swap(array, left, maxInd);
        }
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int arraySize = readBuffer.nextInt();
        System.out.println("Enter array: ");
        int[] array = readArray(arraySize);
        selectionSort(array);
        printArray(array);
    }
}
