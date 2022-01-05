package by.kirikovich.algorithmization.onedimensional_arrays.second;

import java.util.Scanner;

public class Task2 {
    public void doYourJob() {
        System.out.print("Enter n,z: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int numberZ = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        System.out.print("Enter array elements: ");
        int substitutionCounter = 0;
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
            if (array[i] > numberZ) {
                array[i] = numberZ;
                substitutionCounter++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(substitutionCounter);
    }
}
