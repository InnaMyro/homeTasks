package org.qa23.Task04;

import java.util.Scanner;

/*
Задание 4
Пользователь вводит с клавиатуры количество ме- тров.
 В зависимости от выбора пользователя программа
  переводит метры в мили, дюймы или ярды.
* */
public class Task4 {
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
