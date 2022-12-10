package org.qa23.part1.Task06;

import java.util.Scanner;

/*
* Задание 4
Дана точка на плоскости заданная координатами x и y,
определить и вывести в консоль, в какой четверти находит-
ся точка, в прямоугольной (декартовой) системе координат.
Четверти обозначены римскими цифрами.
* */
public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите координату Х");
        int x = console.nextInt();
        System.out.println("Введите координату Y");
        int y = console.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Точка находится в  І четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится в  ІI четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в  ІII четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в  ІV четверти");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка находится на оси У");
        } else if (x != 0 && y == 0) {
            System.out.println("Точка находится на оси Х");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка находится в  начале координат");
        }
    }
}
