package by.kirikovich.basic.cycles.task1;
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = readBuffer.nextInt();
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            summ += i;
        }
        System.out.println(summ);
    }
}
