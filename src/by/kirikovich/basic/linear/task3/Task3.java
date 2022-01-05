package by.kirikovich.basic.linear.task3;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):(𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔(𝑥𝑦)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter x,y:");
        Scanner buf = new Scanner(System.in);
        float x, y;
        x = buf.nextFloat();
        y = buf.nextFloat();
        if (Math.cos(x) - Math.sin(y) == 0) {
            System.out.println("Fault! Division by zero");
            return;
        }
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }
}
