package by.kirikovich.algorithmization.decomposition.tvelvth;

import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {
    private final Scanner readBuffer = new Scanner(System.in);

    public ArrayList<Integer> createArray(ArrayList<Integer> array, int k, int n) {
        int tmp;
        while (k >= n) {
            tmp = (int) (Math.random() * (n + 1));
            array.add(tmp);
            k = k - tmp;
        }
        array.add(k);
        return array;
    }

    public int sumArray(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int a : arrayList) {
            sum+=a;
        }
        return sum;
    }

    public void doYourJob() {
        System.out.print("Enter k, n: ");
        int k = readBuffer.nextInt();
        int n = readBuffer.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        createArray(array, k, n);
        System.out.println(array.toString());
        System.out.println(sumArray(array));
    }
}
