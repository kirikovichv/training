package by.kirikovich.algorithmization.onedimensional_arrays.eighth;

import java.util.Scanner;

public class Task8 {
    public void doYourJob() {
        System.out.print("Enter n: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        System.out.print("Enter array elements: ");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < numberOfElements; i++) {
            if (array[i] == min) {
                for (int j = i; j < numberOfElements - 1; j++) {
                    array[j] = array[j + 1];
                }
                numberOfElements--;
                i--;
            }
        }
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
