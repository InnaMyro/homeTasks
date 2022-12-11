package org.qa23.loop.Task08;


public class Task08 {
    public static void main(String[] args) {
        long first = 1;
        long second = 1;
        long res;
        for (int i = 3; i < 1000000 ; i++) {
            res = first + second;
            System.out.println(res);
            first = second;
            second = res;
        }
    }
}
