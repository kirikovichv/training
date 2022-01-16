package by.kirikovich.strings.stringAsAnCharacterArray.fourth;


import java.util.Scanner;

public class Task4 {
    private Scanner readTemp = new Scanner(System.in);
    private String str = new String();

    public void doYourJob() {
        System.out.println("Введите строку");
        str = readTemp.nextLine();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) {
                if ((str.charAt(i + 1) < '0') || (str.charAt(i + 1) > '9')) {
                    count++;
                }
            }
        }
        if ((str.charAt(str.length() - 1) >= '0') && (str.charAt(str.length() - 1) <= '9')) {
            count++;
        }//предыдущее условие не увеличит счетчик если строка заканчивается числом, по этому учитываем это.
        System.out.println(count);
    }
}
