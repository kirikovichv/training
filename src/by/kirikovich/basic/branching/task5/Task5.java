package by.kirikovich.basic.branching.task5;

import java.util.Scanner;

import static java.lang.Math.pow;

//Вычислить значение функции:
public class Task5 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        float x, y;
        System.out.print("Enter x: ");
        x = readBuffer.nextFloat();
        if (x <= 3) {
            y = x * x - (3 * x) + 9;
        } else {
            y = (float) (1 / (pow(x, 3) + 6));
        }
        System.out.println("y = " + y);
    }
}
