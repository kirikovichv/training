package by.kirikovich.algorithmization.sortings.third;

//Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

public class Main {
    public static void main(String[] args) {
        Task3 task = new Task3();
        task.doYourJob();
    }
}
