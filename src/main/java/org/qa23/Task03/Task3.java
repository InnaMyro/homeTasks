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
            int i = console.nextInt();
            if (i%2 ==0) {
                System.out.println("Event number");
            } else {
                System.out.println("Odd number");
            }
    }
}
