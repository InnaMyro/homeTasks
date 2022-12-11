package org.qa23.string_part1.Task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String symbol = console.next();
        if (symbol.length() > 1) {
            System.out.println("Введен не символ для поиска");
            return;
        }
        int countSymbol = line.split(symbol, -1).length-1;
        if (countSymbol >0) {
            System.out.println("Количество найденных символов в строке = " + countSymbol);
        } else {
            System.out.println("Символов не найдено в строке");
        }
    }
}
