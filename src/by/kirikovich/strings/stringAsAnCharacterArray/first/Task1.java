package by.kirikovich.strings.stringAsAnCharacterArray.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task1 {

    public void printNames(ArrayList<String> arrayListStr) {
        Iterator<String> names = arrayListStr.iterator();
        while (names.hasNext()) {
            System.out.println(names.next());
        }
    }

    public void readVariableName(ArrayList<String> arrayListStr) {
        Scanner readTemp = new Scanner(System.in);
        arrayListStr.add(readTemp.nextLine());
    }

    public String camelCaseToSnakeCase(String str) {
        String newString = new String();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
                newString += "_" + (char) (str.charAt(i) + 32);
            } else
                newString += str.charAt(i);
        }
        return (newString);
    }

    public void doYourJob() {
        ArrayList<String> arrayListStr = new ArrayList<String>();
        System.out.println("Введите переменные. По окончанию нажмите ввод");
        int i = 0;
        while (true) {
            readVariableName(arrayListStr);
            System.out.println(i);
            if (arrayListStr.get(i) == "") {
                break;
            }
            arrayListStr.set(i, camelCaseToSnakeCase(arrayListStr.get(i)));
            i++;
        }
        printNames(arrayListStr);
    }
}
