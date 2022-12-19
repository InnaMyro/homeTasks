package org.qa23.string_part2.Task04;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите предложение или слово для проверки ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine().toLowerCase().replaceAll(" ", "");
        if (text.equals(new StringBuilder(text).reverse().toString())) {
            System.out.println("Полином");
        } else {
            System.out.println("Не полином");
        }
    }
}
