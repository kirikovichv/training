package by.kirikovich.algorithmization.onedimensional_arrays.tenth;

import java.util.Scanner;

public class Task10 {
    public void doYourJob() {
        System.out.print("Enter n: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
        }
        for (int i = 0; i < numberOfElements - 1; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < numberOfElements - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    array[numberOfElements - 1] = 0;
                    numberOfElements--;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
