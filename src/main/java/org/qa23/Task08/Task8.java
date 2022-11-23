package org.qa23.Task08;

import java.util.Scanner;

/*
* Задание 12
Программа запрашивает шестизначное число. После вво-
да определяет, будет ли являться «счастливым» билет с та-
ким номером (сумма первых трех цифр совпадает с суммой
трех последних).
Пример входных данных:
423027
954832
Вывод:
Да
Нет
* */
public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = console.nextInt();
        if (i / 100000 > 0 && i / 100000 < 10) {
            int firstPart = i / 1000;
            int secondPart = i % 1000;
            int firstRes = firstPart / 100 + firstPart % 10 + (firstPart / 10) % 10;
            int secondRes = secondPart / 100 + secondPart % 10 + (secondPart / 10) % 10;
            if (firstRes == secondRes) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");

            }
        } else {
            System.out.println("Вы ввели не шестизначное число");
        }
    }
}
