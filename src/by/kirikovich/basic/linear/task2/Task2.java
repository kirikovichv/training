package by.kirikovich.basic.linear.task2;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter a,b,c:");
        Scanner buf = new Scanner(System.in);
        float a, b, c;
        a = buf.nextFloat();
        b = buf.nextFloat();
        c = buf.nextFloat();
        if (a == 0) {
            System.out.println("Fault! a can't be 0");
            return;
        }
        double z = (((b + Math.sqrt((b * b) + (4 * a * c)))) / 2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.println(z);
    }
}
