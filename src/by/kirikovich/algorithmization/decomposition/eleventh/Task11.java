package by.kirikovich.algorithmization.decomposition.eleventh;

import java.util.Scanner;

public class Task11 {
    private final Scanner readBuffer = new Scanner(System.in);

    public int getRank(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public void doYourJob() {
        System.out.print("Enter a, b: ");
        int a = readBuffer.nextInt();
        int b = readBuffer.nextInt();
        int rankA = getRank(a);
        int rankB = getRank(b);
        if (rankA > rankB) {
            System.out.println(a + " have rank: " +rankA);
        } else{
            if (rankA < rankB){
                System.out.println(b + " have rank: " +rankB);
            } else {
                System.out.println("a and b have rank: " + rankA);
            }
        }
    }
}
