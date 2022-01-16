package by.kirikovich.basic.branching.task1;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter angle 1 and angle 2:");
        Scanner readBuffer = new Scanner(System.in);
        int angle1, angle2;
        angle1 = readBuffer.nextInt();
        angle2 = readBuffer.nextInt();
        if (angle1 + angle2 < 180) {
            System.out.print("Yes, triangle exist and it is ");
            if (180 - angle1 - angle2 == 90) {
                System.out.println("rectangular");
            } else {
                System.out.println("not rectangular");
            }
        } else {
            System.out.println("No, triangle not exist");
        }
    }
}
