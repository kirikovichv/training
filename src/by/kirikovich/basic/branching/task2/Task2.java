package by.kirikovich.basic.branching.task2;
// Найти max{min(a, b), min(c, d)}

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        int a, b, c, d, min1, min2;
        System.out.print("Enter a,b,c,d: ");
        a = readBuffer.nextInt();
        b = readBuffer.nextInt();
        c = readBuffer.nextInt();
        d = readBuffer.nextInt();
        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }
        if (c > d) {
            min2 = d;
        } else {
            min2 = c;
        }
        if (min1 > min2) {
            System.out.println(min1);
        } else {
            System.out.println(min2);
        }
    }
}
