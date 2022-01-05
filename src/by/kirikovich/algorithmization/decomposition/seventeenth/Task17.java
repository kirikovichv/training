package by.kirikovich.algorithmization.decomposition.seventeenth;

import java.util.Scanner;

public class Task17 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int getDigitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public void doYourJob() {
        System.out.print("Enter k : ");
        int k = readBuffer.nextInt();
        int counter = 0;
        while (k > 0) {
            k -= getDigitsSum(k);
            counter++;
        }
        System.out.println(counter);
    }
}
