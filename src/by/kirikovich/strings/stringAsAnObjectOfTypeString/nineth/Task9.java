package by.kirikovich.strings.stringAsAnObjectOfTypeString.nineth;

import java.util.Scanner;

public class Task9 {
    private Scanner readTemp = new Scanner(System.in);

    public void doYourJob() {
        int countSmallLetter = 0, countBigLetter = 0;
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(readTemp.nextLine());
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
                countBigLetter++;
            }
            if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) {
                countSmallLetter++;
            }
        }
        System.out.println("Маленьких букв: " + countSmallLetter);
        System.out.println("Больших букв: " + countBigLetter);
    }
}
