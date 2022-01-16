package by.kirikovich.strings.stringAsAnCharacterArray.fifth;


import java.util.Scanner;

public class Task5 {

    public void doYourJob() {
        Scanner readTemp = new Scanner(System.in);
        String str;
        System.out.println("Введите строку");
        str = readTemp.nextLine().trim();
        String tmpStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' ')) {
                continue;
            } else {
                tmpStr += str.charAt(i);
            }
        }
        tmpStr += str.charAt(str.length());
        System.out.println(tmpStr);
    }
}
