package by.kirikovich.basic.cycles.task5;

import java.util.Scanner;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:
public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter e: ");
        float summa = 0, e = 0;
        Scanner readBuffer = new Scanner(System.in);
        e = readBuffer.nextFloat();
        if (e >= 1.5) {
            for (int i = 1; summa <= e; i--) {
                summa += ((float) 1 / Math.pow(2, i)) + ((float) 1 / Math.pow(3, i));
            }
        } else {
            for (int i = 1; summa <= e; i++) {
                summa += ((float) 1 / Math.pow(2, i)) + ((float) 1 / Math.pow(3, i));
            }
        }
        System.out.println(summa);
    }
}
