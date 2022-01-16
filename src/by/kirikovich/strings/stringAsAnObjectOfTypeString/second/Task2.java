package by.kirikovich.strings.stringAsAnObjectOfTypeString.second;

import java.util.Scanner;

public class Task2 {
    private Scanner readTemp = new Scanner(System.in);

    public void doYourJob() {
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(readTemp.nextLine());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                str.insert(i + 1, 'b');
            }
        }
        System.out.println(str);
    }
}