package by.kirikovich.algorithmization.decomposition.second;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int nOD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        if (b % a == 0) {
            return a;
        }
        if (a > b) {
            return nOD(a % b, b);
        }
        return nOD(a, b % a);
    }

    public int nOK(int a, int b) {
        return ((a * b) / nOD(a, b));
    }

    public void doYourJob() {
        System.out.print("Enter a b c d: ");
        int a = readBuffer.nextInt();
        int b = readBuffer.nextInt();
        int c = readBuffer.nextInt();
        int d = readBuffer.nextInt();
        System.out.println(nOD(a,nOD(b,nOD(c,d))));
    }
}
