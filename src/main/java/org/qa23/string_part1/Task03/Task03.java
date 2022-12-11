package org.qa23.string_part1.Task03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String[] s = text.split(" ");
        int summLength = 0;
        for (int i = 0; i <s.length ; i++) {
            summLength += s[i].length();
        }
        System.out.println(s.length);
        System.out.println("Средняя длинна слова в предложении = " + summLength/s.length);
    }
}
