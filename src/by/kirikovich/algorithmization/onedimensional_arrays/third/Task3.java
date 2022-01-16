package by.kirikovich.algorithmization.onedimensional_arrays.third;

import java.util.Scanner;

public class Task3 {
    public void doYourJob() {
        System.out.print("Enter n: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        System.out.print("Enter array elements: ");
        int countAboveZero = 0;
        int countLessZero = 0;
        int countZero = 0;
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
            if (array[i] > 0) {
                countAboveZero++;
            }
            if (array[i] == 0) {
                countZero++;
            }
            if (array[i] < 0) {
                countLessZero++;
            }
        }
        System.out.println("Elements > 0:" + countAboveZero);
        System.out.println("Elements = 0:" + countZero);
        System.out.println("Elements < 0:" + countLessZero);
    }
}
