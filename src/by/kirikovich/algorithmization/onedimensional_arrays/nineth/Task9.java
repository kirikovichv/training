package by.kirikovich.algorithmization.onedimensional_arrays.nineth;

import java.util.Scanner;

public class Task9 {
    public void doYourJob() {
        System.out.print("Enter n: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        int maxSequence = 1;
        int sequenceNumber = 0;
        int countSequence = 1;
        System.out.print("Enter array elements: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
        }
        for (int i = 0; i < numberOfElements - 1; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                if (array[i] > array[j]) {
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
            if (i == 0) {
                sequenceNumber = array[i];
            } else if (array[i] == array[i - 1]) {
                countSequence++;
            } else if (countSequence > maxSequence) {
                maxSequence = countSequence;
                sequenceNumber = array[i - 1];
            }
        }
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("There were " + maxSequence + " " + sequenceNumber);
    }
}
