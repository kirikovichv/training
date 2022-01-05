package by.kirikovich.algorithmization.decomposition.fourteenth;

import java.util.ArrayList;
import java.util.Scanner;

public class Task14 {
    private final Scanner readBuffer = new Scanner(System.in);

    public ArrayList<Integer> decomposeNumber(ArrayList<Integer> arrayList, int n) {
        while (n > 0) {
            arrayList.add(n % 10);
            n = n / 10;
        }
        return arrayList;
    }

    public boolean isNumberArmstrong(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        decomposeNumber(arrayList, i);
        int sum = 0;
        for (int tmp : arrayList) {
            sum += Math.pow(tmp, arrayList.size());
        }
        if (sum == i) {
            return true;
        } else {
            return false;
        }
    }

    public void printArmstrongNumbers(int k) {

        for (int i = 1; i <= k; i++) {
            if (isNumberArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public void doYourJob() {
        System.out.print("Enter k : ");
        int k = readBuffer.nextInt();
        printArmstrongNumbers(k);
    }
}
