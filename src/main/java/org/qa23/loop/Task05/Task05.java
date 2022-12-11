package org.qa23.loop.Task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();
        String str = console.next();
        if (str.length() > 1) {
            System.out.println("Вы ввели строку.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(str);
            }
        }

    }
}
