package by.kirikovich.strings.stringAsAnObjectOfTypeString.sixth;

import java.util.Scanner;

public class Task6 {
    private Scanner readTemp = new Scanner(System.in);

    public void doYourJob() {
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(readTemp.nextLine());
        for (int i = 0; i < str.length(); i += 2) {
            str.insert(i + 1, str.charAt(i));
        }
        System.out.println(str);
    }
}