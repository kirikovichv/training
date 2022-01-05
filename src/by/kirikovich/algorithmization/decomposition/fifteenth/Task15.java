package by.kirikovich.algorithmization.decomposition.fifteenth;

import java.util.Scanner;

public class Task15 {
    private final Scanner readBuffer = new Scanner(System.in);
    private static final int TEN = 10;

    public boolean checkNumber(int n) {
        while (n > 1) {
            if (n % 10 <= (n / 10) % 10) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public void printDigits(int n) {
        int startValue = (int) Math.pow(TEN, n - 1);
        for (int i = startValue; i < startValue * TEN; i++) {
            if (checkNumber(i)) {
                System.out.println(i);
            }
        }
    }


    public void doYourJob() {
        System.out.print("Enter n : ");
        int n = readBuffer.nextInt();
        printDigits(n);
    }
}
