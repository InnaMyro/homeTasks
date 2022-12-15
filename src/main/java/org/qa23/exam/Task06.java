package org.qa23.exam;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Программа вычисляет сумму скидки исходя из стоимости покупки");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вашей покупки");
        float summ = scanner.nextFloat();
        if (summ <= 0) {
            System.out.println("Стоимость не может быть меньше 0 или равно 0");
        }
        if (summ > 0 && summ < 251) {
            System.out.println("К величайшому сожалению у вас нет скидки. Для получения скидки купите что то дороже 250");
        } else if (summ > 250 && summ < 501) {
            System.out.println("Размер вашей скидки составляет 5%");
            System.out.println("Сумма покупки с учётом скидки = " + (summ - (summ *0.05)));
        } else if (summ > 500 && summ < 1001) {
            System.out.println("Размер вашей скидки составляет 10%");
            System.out.println("Сумма покупки с учётом скидки = " + (summ - (summ *0.1)));
        } else if (summ > 1000) {
            System.out.println("Размер вашей скидки составляет 15%");
            System.out.println("Сумма покупки с учётом скидки = " + (summ - (summ *0.15)));
        }
    }
}
