package by.kirikovich.algorithmization.sortings.eighth;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    private final Scanner readBuffer = new Scanner(System.in);

    public void readFractions(int[] numerator, int[] denominator) {
        for (int i = 0; i < numerator.length; i++) {
            numerator[i] = readBuffer.nextInt();
            System.out.print("/");
            denominator[i] = readBuffer.nextInt();
        }
    }

    public void printFractions(int[] numerator, int[] denominator) {
        for (int i = 0; i < numerator.length; i++) {
            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
        System.out.println();
    }

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

    public void leadToCommonDenominator(int[] numerator, int[] denominator) {
        int commonDenominator = 1;
        for (int i = 0; i < numerator.length; i++) {
            commonDenominator = nOK(commonDenominator, denominator[i]);
        }
        for (int i = 0; i < numerator.length; i++) {
            numerator[i] = (commonDenominator / denominator[i]) * numerator[i];
            denominator[i] = commonDenominator;
        }
    }

    public void doYourJob() {
        System.out.print("Enter number of fractions: ");
        int n = readBuffer.nextInt();
        System.out.println("Enter fractions in view a/b: ");
        int[] numerator = new int[n];
        int[] denominator = new int[n];
        readFractions(numerator, denominator);
        leadToCommonDenominator(numerator, denominator);
        Arrays.sort(numerator);
        printFractions(numerator, denominator);
    }
}
