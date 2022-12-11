package org.qa23.string_part1.Task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        if ((line.contains(" ") || line.contains(":") )&& line.length() > 1) {
            String[] s = line.split(" ");
            String[] split = line.split(":");
            int countChetWord = 0;
            if (split.length > 1) {
                for (int i = 0; i < split.length; i++) {
                    if (split[i].length() % 2 == 0) {
                        countChetWord++;
                    }
                }
            } else if (s.length > 1) {
                for (int i = 0; i <s.length ; i++) {
                    if (s[i].length() % 2 == 0) {
                        countChetWord++;
                    }
                }
            }
            System.out.println("Колличество четных слов в строке = " + countChetWord);
        } else {
            System.out.println("Введена не валидная строка");
        }
    }
}
