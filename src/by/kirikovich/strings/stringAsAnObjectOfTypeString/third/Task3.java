package by.kirikovich.strings.stringAsAnObjectOfTypeString.third;

import java.util.Scanner;

public class Task3 {
    private Scanner readTemp = new Scanner(System.in);
    private String str = new String();
    private int maxSequence = 0, count = 0;

    public void doYourJob() {
        System.out.println("Введите строку");
        str = readTemp.nextLine();
        boolean flag = false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Не палиндром!");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Палиндром!");
        }
    }
}