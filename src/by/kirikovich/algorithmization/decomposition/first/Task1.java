package by.kirikovich.algorithmization.decomposition.first;

import java.util.Scanner;

public class Task1 {
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
        System.out.print("Enter a and b: ");
        int a = readBuffer.nextInt();
        int b = readBuffer.nextInt();
        System.out.println("NOD is: " + nOD(a, b) + " NOK is: " + nOK(a, b));
    }
}
