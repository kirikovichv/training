package by.kirikovich.basic.cycles.task7;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
public class Task7 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        System.out.print("Enter m, n: ");
        int n, m;
        m = readBuffer.nextInt();
        n = readBuffer.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.println("From " + i);
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    flag = true;
                }
            }
            if (flag) {
                System.out.println();
            } else {
                System.out.println("no numbers");
            }
        }
    }
}
