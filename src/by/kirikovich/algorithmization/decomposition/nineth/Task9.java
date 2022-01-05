package by.kirikovich.algorithmization.decomposition.nineth;

import java.util.Scanner;

public class Task9 {
    private final Scanner readBuffer = new Scanner(System.in);

    public double getSquare(int x, int y, int z, int t) {
        double semiPerimeter = (x + y + z + t) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - x) * (semiPerimeter - y) * (semiPerimeter - z) * (semiPerimeter - t));
    }

    public void doYourJob() {
        System.out.print("Enter X, Y, Z, T: ");
        int x = readBuffer.nextInt();
        int y = readBuffer.nextInt();
        int z = readBuffer.nextInt();
        int t = readBuffer.nextInt();
        System.out.println(getSquare(x, y, z, t));
    }
}
