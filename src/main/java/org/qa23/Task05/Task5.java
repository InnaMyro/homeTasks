package org.qa23.Task05;

import java.util.Scanner;

/*
Задание 5
Пользователь с клавиатуры вводит количество часов.
Если полученное значение находится в диапазоне от 0 до 6
нужно вывести надпись «Good Night», если в диапазоне
от 6 до 13 «Good Morning», если в диапазоне от 13 до 17 «Good Day»,
если в диапазоне от 17 до 0 «Good Evening».
Верхняя граница диапазона не включается.
Например, число 6 относится к 6 до 13.
* */
public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите колличество часов");
        int a = console.nextInt();
        if (a >= 0 && a < 6) {
            System.out.println("Good Night");
        } else if (a >= 6 && a < 13) {
            System.out.println("Good Morning");
        } else if (a >= 13 && a < 17) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Нечего тут тыкать");
        }
    }

}
