package by.kirikovich.strings.stringAsAnCharacterArray.second;


import java.util.Scanner;

public class Task2 {

    public void doYourJob() {
        final String SEARCH_STR = new String("word");
        final String REPLACEMENT_STR = new String("letter");
        Scanner readTemp = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = readTemp.nextLine();
        str = str.replaceAll(SEARCH_STR, REPLACEMENT_STR);
        System.out.println(str);
    }
}
