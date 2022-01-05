//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

package by.kirikovich.basic.linear.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter a,b,c:");
        Scanner buf = new Scanner(System.in);
        float a, b, c;
        a = buf.nextFloat();
        b = buf.nextFloat();
        c = buf.nextFloat();
        float z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }
}
