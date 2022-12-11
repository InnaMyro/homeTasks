package org.qa23.arrays.Task09;

import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(-100,100);
        }
        int sumNegativElement = 0;
        int sumChetElement = 0;
        int sumNeCheElement = 0;
        for (int a = 0; a < arrays.length; a++) {
            if (arrays[a] > 0) {
                if (arrays[a] % 2 == 0) {
                    sumChetElement += arrays[a];
                } else {
                    sumNeCheElement += arrays[a];
                }
            }
            if (arrays[a] < 0) {
                sumNegativElement += arrays[a];
            }


        }
        System.out.println("Сумма четных чисел = " + sumChetElement);
        System.out.println("Сумма не четных чисел = " + sumNeCheElement);
        System.out.println("Сумма  чисел меньше 0 = " + sumNegativElement);
    }
}
