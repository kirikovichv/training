package by.kirikovich.algorithmization.sortings.seventh;

import java.util.Scanner;

public class Task7 {
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

    public void insert(int[] array1, int[] array2) {
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= array2[j]) {
                System.out.print("Before " + array1[i] + " you need past ");
                while ((j < array2.length) && (array1[i] >= array2[j])) {
                    System.out.print(array2[j] + " ");
                    j++;
                }
                System.out.println();
            }
        }
        System.out.print("At the end you need past ");
        for (; j < array2.length; j++) {
            System.out.print(array2[j] + " ");
        }
    }

    public void doYourJob() {
        System.out.print("Enter number of elements in the first and second array: ");
        int m = readBuffer.nextInt();
        int n = readBuffer.nextInt();
        System.out.print("Enter first array: ");
        int[] array1 = new int[m];
        readArray(array1, m);

        System.out.print("Enter second array: ");
        int[] array2 = new int[n];
        readArray(array2, n);

        insert(array1, array2);
    }
}
