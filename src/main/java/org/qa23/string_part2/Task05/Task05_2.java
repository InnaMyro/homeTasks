package org.qa23.string_part2.Task05;

public class Task05_2 {
    public static void main(String[] args) {
        String text = "fgfghs dfh f567 hjjf. hr ghgf634 sdgf";
        char[] chars = text.toCharArray();
        int countDigit = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                countDigit++;
            }
        }
        System.out.println("Количество цифр в тексте = " + countDigit);
    }
}
