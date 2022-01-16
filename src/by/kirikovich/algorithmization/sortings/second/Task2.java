package by.kirikovich.algorithmization.sortings.second;

import java.util.Scanner;

public class Task2 {
    private final Scanner readBuffer = new Scanner(System.in);

    public void readArray(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = readBuffer.nextInt();
        }
        for (int i = arraySize; i < array.length; i++) {
            array[i] = Integer.MAX_VALUE;
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insert(int[] array1, int[] array2, int m) {
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] <= array2[j]) {
                continue;
            } else {
                for (int k = m; k > i; k--) {
                    array1[k] = array1[k - 1];
                }
                array1[i] = array2[j];
                j++;
                m++;
            }
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

        insert(array1, array2, m);
        printArray(array1);
    }
}
