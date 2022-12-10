package org.qa23.loop.Task07;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int result = 0;
        float aricmet;
        if (first > second) {

            for (int i = second; i <= first ; i++) {
                result += i;
            }
            aricmet = (float)result / ((first-second) + 1);
            System.out.println("Сумма чисел в диапазоне = " + (result));
            System.out.println("Среднеарефметическое = " + aricmet);

        } else if (first < second) {
            for (int i = first; i <= second ; i++) {
                result += i;
            }
            aricmet = (float) result / ((second-first) + 1);
            System.out.println("Сумма чисел в диапазоне = " + (result));
            System.out.println("Среднеарефметическое = " + aricmet);
        } else {
            System.out.println("Ввели не диапазон чисел");
        }

    }
}
