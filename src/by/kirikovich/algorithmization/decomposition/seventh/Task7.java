package by.kirikovich.algorithmization.decomposition.seventh;

import java.util.Scanner;

public class Task7 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int getFaktorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int getSumFactorial(int n) {
        int sumFactorial = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sumFactorial += getFaktorial(i);
            }
        }
        return sumFactorial;
    }

    public void doYourJob() {
        System.out.println(getSumFactorial(9));
    }
}
