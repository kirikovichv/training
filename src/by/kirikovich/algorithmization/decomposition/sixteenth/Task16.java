package by.kirikovich.algorithmization.decomposition.sixteenth;

import java.util.Scanner;

public class Task16 {
    private final Scanner readBuffer = new Scanner(System.in);

    public static final int TEN = 10;

    public boolean isNumberOnlyOddDigits(int n) {
        while (n > 1) {
            if (n % 2 == 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public int howManyEvenDigits(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public void printDigits(int n) {
        int startValue = (int) Math.pow(TEN, n - 1);
        int sum = 0;
        for (int i = startValue; i < startValue * TEN; i++) {
            if (isNumberOnlyOddDigits(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
        System.out.println(howManyEvenDigits(sum));
    }

    public void doYourJob() {
        System.out.print("Enter n : ");
        int n = readBuffer.nextInt();
        printDigits(n);
    }
}
