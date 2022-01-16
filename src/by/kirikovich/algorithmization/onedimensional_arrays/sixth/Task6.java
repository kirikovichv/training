package by.kirikovich.algorithmization.onedimensional_arrays.sixth;

import java.util.Scanner;

public class Task6 {
    public void doYourJob() {
        System.out.print("Enter n: ");
        Scanner readBuffer = new Scanner(System.in);
        int numberOfElements = readBuffer.nextInt();
        int[] array = new int[numberOfElements];
        float sum = 0;
        System.out.print("Enter array elements: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = readBuffer.nextInt();
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if ((flag == false) && (i > 1)) sum += array[i];
        }
        System.out.println(sum);
    }
}
