package by.kirikovich.strings.regularExpressoins.task2;

//2. Дана строка, содержащая следующий текст (xml-документ):
//<notes>
//  <note id = "1">
//      <to>Вася</to>
//      <from>Света</from>
//      <heading>Напоминание</heading>
//      <body>Позвони мне завтра!</body>
//  </note>
//  <note id = "2">
//      <to>Петя</to>
//      <from>Маша</from>
//      <heading>Важное напоминание</heading>
//      <body/>
//  </note>
//</notes>
//Напишите анализатор, позволяющий последовательно возвращать содержимое
//узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое
// тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Task2 task = new Task2();
        task.doYourJob();
    }
}
