package by.kirikovich.basic.linear.task5;
// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter T in seconds:");
        Scanner readBuffer = new Scanner(System.in);
        int t, hour, min, sec;
        t = readBuffer.nextInt();
        hour = t / 3600;
        min = (t - hour * 3600) / 60;
        sec = t % 60;
        System.out.println(hour + " ч " + min + " мин " + sec + " c");
    }
}
