package org.qa23.loop.Task06;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first = console.nextInt();
        int second = console.nextInt();
        if (first == second || first > second) {
            System.out.println("Диапазон для анализа введен не коректно");
        } else {
            for (int i = first; i <= second; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
