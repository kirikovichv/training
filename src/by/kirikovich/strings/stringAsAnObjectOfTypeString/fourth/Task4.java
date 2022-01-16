package by.kirikovich.strings.stringAsAnObjectOfTypeString.fourth;

public class Task4 {
    private StringBuilder str = new StringBuilder("информатика");
    private String str2;

    public void doYourJob() {
        str2 = str.charAt(7) + str.substring(3, 5) + str.charAt(7);
        System.out.println(str2);
    }
}