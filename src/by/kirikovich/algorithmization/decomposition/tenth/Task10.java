package by.kirikovich.algorithmization.decomposition.tenth;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    private final Scanner readBuffer = new Scanner(System.in);

    public ArrayList<Integer> createArray(ArrayList<Integer> array, int n) {
        while (n > 0) {
            array.add(n % 10);
            n = n / 10;
        }
        return array;
    }

    public void doYourJob() {
        System.out.print("Enter n: ");
        int n = readBuffer.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        createArray(array, n);
        System.out.println(array.toString());
    }
}
