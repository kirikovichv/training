package by.kirikovich.strings.stringAsAnObjectOfTypeString.tenth;

import java.util.Scanner;

public class Task10 {
    private Scanner readTemp = new Scanner(System.in);

    public void doYourJob() {
        int countSentence = 0;
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(readTemp.nextLine());
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '!') || (str.charAt(i) == '?') || (str.charAt(i) == '.')) {
                countSentence++;
            }
        }
        System.out.println("Предложений: " + countSentence);
    }
}