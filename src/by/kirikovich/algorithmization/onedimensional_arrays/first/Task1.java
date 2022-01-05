package by.kirikovich.algorithmization.onedimensional_arrays.first;

import java.util.Scanner;

public class Task1 {
    public void doYourJob() {
        System.out.print("Enter n, k: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int numberK = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        System.out.print("Enter array elements: ");
        int sum = 0;
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
            if (array[i] % numberK == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
