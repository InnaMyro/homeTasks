package org.qa23.loop.Task04;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lenght = input.nextInt();
        for (int i = 0; i < lenght; i++) {
            System.out.print("*");
        }
    }
}
