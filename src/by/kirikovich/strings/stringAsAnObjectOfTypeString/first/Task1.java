package by.kirikovich.strings.stringAsAnObjectOfTypeString.first;

import java.util.Scanner;

public class Task1 {
    private Scanner readTemp = new Scanner(System.in);
    private String str = new String();
    private int maxSequence = 0, count = 0;

    public void doYourJob() {
        System.out.println("Введите строку");
        str = readTemp.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                if (count > maxSequence) {
                    maxSequence = count;
                }
                count = 0;
            }
        }
        if (count > maxSequence) {
            maxSequence = count;
        }
        System.out.println(maxSequence);
    }
}
