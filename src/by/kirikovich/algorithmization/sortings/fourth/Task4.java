package by.kirikovich.algorithmization.sortings.fourth;

import java.util.Scanner;

public class Task4 {
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

    public void swapSort(int[] array) {
        int counter = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    needIteration = true;
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public void insertionSort(int[] array) {
        for (int left = 1; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int arraySize = readBuffer.nextInt();
        System.out.println("Enter array: ");
        int[] array = readArray(arraySize);
        swapSort(array);
        printArray(array);
    }
}
