package by.kirikovich.algorithmization.decomposition.sixth;

import java.util.Scanner;

public class Task6 {
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

    public void doYourJob() {
        System.out.print("Enter a b c: ");
        int a = readBuffer.nextInt();
        int b = readBuffer.nextInt();
        int c = readBuffer.nextInt();
        if (nOD(a, nOD(b, c)) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
