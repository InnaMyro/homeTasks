package org.qa23.Task04;

import java.util.Scanner;

/*
Задание 4
Пользователь вводит с клавиатуры количество метров.
 В зависимости от выбора пользователя программа
  переводит метры в мили, дюймы или ярды.
* */
public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите колличество метров");
        float a = console.nextFloat();
        System.out.println("Преобразовать в мили - 1 ");
        System.out.println("Преобразовать в дюймы - 2 ");
        System.out.println("Преобразовать в ярды - 3 ");
        int numberOperation = console.nextInt();
        if (numberOperation == 1) {
            System.out.println(a + " метров = " + (a * 0.00062137) + " милей");
        } else if (numberOperation == 2) {
            System.out.println(a + " метров = " + (a * 39.370) + " дюймов");
        } else if (numberOperation == 3) {
            System.out.println(a + " метров = " + (a * 1.09361) + " ярдов");
        } else {
            System.out.println("Недопустимый номер операции");
        }
    }
}
