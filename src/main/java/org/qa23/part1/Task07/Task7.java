package org.qa23.part1.Task07;

import java.util.Scanner;

/*
* Задание 7
Пользователь вводит с клавиатуры букву. Программа
должна определить, в какой раскладке введена буква – в ла-
тинской или кирилице. Вывести в консоль: «латиница», если
буква введена латиницей или «кирилица», если буква отно-
сится к кирилическому алфавиту. Если введена цифра, а не
буква, вывести «цифра». Если символ не относится ни к бук-
вам, ни к цифрам, вывести «невозможно определить».

* */
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String i = console.nextLine();
        if (i.length() == 1) {
            int c = i.charAt(0);
            if ((c >= 1040 && c <= 1103) || c == 1105 || c == 1025) {
                System.out.println("Кириллица");
            } else if (c >= 48 && c <= 57) {
                System.out.println("Цифра");
            } else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                System.out.println("Латиница");
            } else {
                System.out.println("Невозможно определить");
            }
        } else {
            System.out.println("Введен не символ");
        }
    }
}
