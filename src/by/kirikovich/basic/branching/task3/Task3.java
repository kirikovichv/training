package by.kirikovich.basic.branching.task3;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        System.out.print("Enter x,y from points A, B, C: ");
        float x1, x2, x3, y1, y2, y3, b, k;
        x1 = readBuffer.nextFloat();
        y1 = readBuffer.nextFloat();
        x2 = readBuffer.nextFloat();
        y2 = readBuffer.nextFloat();
        x3 = readBuffer.nextFloat();
        y3 = readBuffer.nextFloat();
        k = (y2 - y1) / (x2 - x1);
        b = y1 - (x1 * k);
        if (y3 == k * x3 + b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
