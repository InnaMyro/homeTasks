package org.qa23.exam;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Программа вычисляет периметр заданной фигуры");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длинну отрезка АВ ");
        double ab = console.nextDouble();
        System.out.println("Введите длинну отрезка АC ");
        double ac = console.nextDouble();
        System.out.println("Введите длинну отрезка CD ");
        double cd = console.nextDouble();
        double bc = Math.sqrt((Math.pow(ab,2)+ Math.pow(ac,2)));
        double bd = Math.sqrt((Math.pow(bc,2)+ Math.pow(cd,2)));
        double result = ab + ac + cd + bd;
        System.out.println("Перимерт фигуры равен " + result);

    }
}
