package by.kirikovich.basic.cycles.task2;
//Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        System.out.print("Enter a, b, h: ");
        float a, b, h;
        a = readBuffer.nextFloat();
        b = readBuffer.nextFloat();
        h = readBuffer.nextFloat();
        for (float i = a; i <= b; i += h) {
            if (i <= 2) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
