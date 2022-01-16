package by.kirikovich.strings.stringAsAnCharacterArray.third;


import java.util.Scanner;

public class Task3 {
    private Scanner readTemp = new Scanner(System.in);
    private String str = new String();

    public void doYourJob() {
        System.out.println("Введите строку");
        str = readTemp.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
