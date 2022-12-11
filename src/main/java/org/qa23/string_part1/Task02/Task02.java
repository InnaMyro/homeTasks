package org.qa23.string_part1.Task02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int index = console.nextInt();
        String stringNumber= "";

        for (int i = 1; i <10000 ; i++) {
            if (stringNumber.length() < 1000) {
                stringNumber += i;
            }
        }
        System.out.println(stringNumber);
        System.out.println("число под индексом = "+ stringNumber.substring(index-1, index + String.valueOf(index).length()-1));
    }
}
