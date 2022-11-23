package org.qa23.Task02;

import java.util.Scanner;

/*
Задание 2
Пользователь вводит с клавиатуры три числа.
В за- висимости от выбора пользователя программа
выводит на экран сумму трёх чисел или произведение трёх чисел.
* */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
            int i = console.nextInt();
            if (i%2 ==0) {
                System.out.println("Event number");
            } else {
                System.out.println("Odd number");
            }
    }
}
