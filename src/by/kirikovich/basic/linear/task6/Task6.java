package by.kirikovich.basic.linear.task6;
//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter x, y:");
        Scanner readBuffer = new Scanner(System.in);
        int x, y;
        x = readBuffer.nextInt();
        y = readBuffer.nextInt();
        System.out.println(((y >= 0) && (y <= 4) && (x >= -2) && (x <= 2)) || ((y >= -3) && (y <= 0) && (x >= -4) && (x <= 4) && !((x == 0) && (y == -1))));
    }
}
