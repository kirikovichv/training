package by.kirikovich.algorithmization.decomposition.thirteenth;

import java.util.Scanner;

public class Task13 {
    private final Scanner readBuffer = new Scanner(System.in);

    public void printTwins(int n) {
        if (n < 4) {
            System.out.println("No twins");
            return;
        } else {
            System.out.print("[" + 3 + " " + 5 + "] ");
        }
        int i = 1;
        while ((6 * i + 1) <= (2 * n)) {
            System.out.print("[" + (6 * i - 1) + " " + (6 * i + 1) + "] ");
            i++;
        }
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int n = readBuffer.nextInt();
        printTwins(n);
    }
}
