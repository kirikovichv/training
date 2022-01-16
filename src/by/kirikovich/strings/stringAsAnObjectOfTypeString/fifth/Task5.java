package by.kirikovich.strings.stringAsAnObjectOfTypeString.fifth;

import java.util.Scanner;

public class Task5 {
    private Scanner readTemp = new Scanner(System.in);
    private String str = new String();
    private int count = 0;

    public void doYourJob() {
        System.out.println("Введите строку");
        str = readTemp.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}