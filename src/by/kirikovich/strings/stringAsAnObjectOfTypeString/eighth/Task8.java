package by.kirikovich.strings.stringAsAnObjectOfTypeString.eighth;

import java.util.Scanner;

public class Task8 {

    public void doYourJob() {

        Scanner readTemp = new Scanner(System.in);
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(readTemp.nextLine());
        str.insert(str.length(), " ");
        final int incrementConstant = 1;
        int indexOfStartWord = 0;
        int indexOfEndWord = 0;
        int indexOfStartWordTemp = 0;
        int indexOfEndWordTemp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                indexOfEndWordTemp = i;
            } else {
                if (indexOfEndWordTemp - indexOfStartWordTemp > indexOfEndWord - indexOfStartWord) {
                    indexOfEndWord = indexOfEndWordTemp;
                    indexOfStartWord = indexOfStartWordTemp;
                }
                indexOfStartWordTemp = i;
            }
        }
        System.out.println(str.subSequence(indexOfStartWord + incrementConstant, indexOfEndWord + incrementConstant));
    }
}