package by.kirikovich.basic.linear.task4;
// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter R:");
        Scanner buf = new Scanner(System.in);
        float R, c, d;
        R = buf.nextFloat();
        c = (int) R;
        d = R - (int) R;
        System.out.printf("%.3f %n", ((int) (d * 1000) + (c / 1000)));
    }
}
