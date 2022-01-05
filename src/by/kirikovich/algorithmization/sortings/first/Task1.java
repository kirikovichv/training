package by.kirikovich.algorithmization.sortings.first;

import java.util.Scanner;

public class Task1 {
    private final Scanner readBuffer = new Scanner(System.in);

    public void readArray(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = readBuffer.nextInt();
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insert(int[] array1, int[] array2, int k) {
        for (int i = array1.length - 1; i > array1.length - array2.length; i--) {
            array1[i] = array1[i - array2.length];
        }
        for (int i = 0; i < array2.length; i++) {
            array1[i + k] = array2[i];
        }
    }

    public void doYourJob() {
        System.out.print("Enter number of elements in the first and second array: ");
        int m = readBuffer.nextInt();
        int n = readBuffer.nextInt();
        System.out.print("Enter first array: ");
        int[] array1 = new int[m + n];
        readArray(array1, m);

        System.out.print("Enter second array: ");
        int[] array2 = new int[n];
        readArray(array2, n);

        System.out.print("Enter position for insert: ");
        int k = readBuffer.nextInt();
        insert(array1, array2, k);
        printArray(array1);
    }
}
