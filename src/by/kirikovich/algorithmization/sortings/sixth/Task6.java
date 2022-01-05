package by.kirikovich.algorithmization.sortings.sixth;

import java.util.Scanner;

public class Task6 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int[] readArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = readBuffer.nextInt();
        }
        return (array);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void shellSort(int[] array) {
// Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int arraySize = readBuffer.nextInt();
        System.out.println("Enter array: ");
        int[] array = readArray(arraySize);
        shellSort(array);
        printArray(array);
    }
}
