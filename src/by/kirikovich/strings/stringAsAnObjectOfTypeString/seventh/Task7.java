package by.kirikovich.strings.stringAsAnObjectOfTypeString.seventh;

import java.util.Scanner;

public class Task7 {
    private Scanner readTemp = new Scanner(System.in);

    public void doYourJob() {
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(readTemp.nextLine());
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if ((str.charAt(i) == str.charAt(j)) || (str.charAt(j) == ' ')) {
                    str.deleteCharAt(j);
                }
            }
        }
        System.out.println(str);
    }
}