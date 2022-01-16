package by.kirikovich.basic.cycles.task8;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
public class Task8 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        System.out.print("Enter m, n: ");
        int n, m;
        boolean[] myArray;
        myArray = new boolean[10];
        m = readBuffer.nextInt();
        n = readBuffer.nextInt();
        while (m > 0) {
            int chislo1 = m % 10;
            m /= 10;
            int buffern = n;
            while (buffern > 0) {
                int chislo2 = buffern % 10;
                buffern /= 10;
                if (chislo2 == chislo1) {
                    myArray[chislo1] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (myArray[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
