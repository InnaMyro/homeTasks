package org.qa23.exam;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberFromDiapason = console.nextInt();
        if (numberFromDiapason < 1 || numberFromDiapason > 25) {
            System.out.println("Не правильный ввод. Введите число в диапазоне от 1 до 25");
        } else {
            if (numberFromDiapason == 1 || numberFromDiapason == 21) {
                System.out.println(numberFromDiapason + " книга");
            } else if ((numberFromDiapason > 1 && numberFromDiapason < 5) || (numberFromDiapason>21 && numberFromDiapason< 25)) {
                System.out.println(numberFromDiapason + " книги");
            } else {
                System.out.println(numberFromDiapason + " книг");
            }
        }
    }
}
