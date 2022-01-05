package by.kirikovich.algorithmization.onedimensional_arrays.fifth;

import java.util.Scanner;

public class Task5 {
    public void doYourJob() {
        System.out.print("Enter n: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
