package org.qa23.part1.Task02;

import java.util.Scanner;

/*
Задание 2
Пользователь вводит с клавиатуры три числа.
В зависимости от выбора пользователя программа
выводит на экран сумму трёх чисел или произведение трёх чисел.
* */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int d = console.nextInt();
        int f = console.nextInt();
        System.out.println("Для выполнения операции сложения чисел введите - 1 ");
        System.out.println("Для выполнения операции умножения чисел введите - 2 ");
        int numberOperation = console.nextInt();
        if (numberOperation == 1) {
            System.out.println("Сумма чисел = " + (a + d + f));
        } else if (numberOperation == 2) {
            System.out.println("Результат умножения = " + (a * d * f));
        } else {
            System.out.println("Недопустимый номер операции");
        }
    }
}
