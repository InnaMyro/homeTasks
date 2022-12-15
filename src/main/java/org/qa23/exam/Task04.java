package org.qa23.exam;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Программа вычисляет уравнение");
        Scanner console = new Scanner(System.in);
        float a = console.nextFloat();
        float b = console.nextFloat();
        float result = (float) ( 3.56 * Math.pow((a + b), 3) - 5.8F * Math.pow(b, 2) + 3.8F * a - 1.5F);
        System.out.println("Результат вычислений = " + result);
    }
}
