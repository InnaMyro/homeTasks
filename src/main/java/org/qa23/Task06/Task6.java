package org.qa23.Task06;

import java.util.Scanner;

/*
* Пользователь вводит с клавиатуры число.
* Необходи- мо проверить его на четность
* и нечетность. Если число четное требуется
* вывести на экран число и надпись «Even number».
*  Если число нечетное выведите на экран число и надпись «Odd number».
* */
public class Task6 {
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
