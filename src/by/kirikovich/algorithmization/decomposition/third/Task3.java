package by.kirikovich.algorithmization.decomposition.third;

import java.util.Scanner;

public class Task3 {
    private final Scanner readBuffer = new Scanner(System.in);

    public double getTriangleSquare(int a) {
        return (double) a * Math.sqrt(3d / 4d);
    }

    public double getSixAngleSquare(int a) {
        return getTriangleSquare(a) * 6d;
    }

    public void doYourJob() {
        System.out.print("Enter a: ");
        int a = readBuffer.nextInt();
        System.out.println(getSixAngleSquare(a));
    }
}
