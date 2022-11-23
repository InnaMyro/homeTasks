package org.qa23.Task03;

import java.util.Scanner;

/*
Задание 3
Пользователь вводит с клавиатуры три числа.
 В за- висимости от выбора пользователя программа выводит на экран максимум из трёх,
  минимум из трёх или сред- неарифметическое трёх чисел.
* */
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Введите второе число");
        int d = console.nextInt();
        System.out.println("Введите третье число");
        int f = console.nextInt();
        System.out.println("Для для вывода максимума из трех чисел введите - 1 ");
        System.out.println("Для для вывода минимума из трех чисел введите - 2 ");
        System.out.println("Для для вывода среднеарифметического трех чисел введите - 3 ");
        int numberOperation = console.nextInt();
        if (numberOperation == 1) {
            System.out.println("Максисимум чисел = " + Math.max(Math.max(a,d), f));
        } else if (numberOperation == 2) {
            System.out.println("Минимум чисел = " + Math.min(Math.min(a,d), f));
        } else if (numberOperation == 3) {
            System.out.println("Среднеарефметическое чисел = " +((a+d+f) / 3));
        } else {
            System.out.println("Недопустимый номер операции");
        }
    }
}
