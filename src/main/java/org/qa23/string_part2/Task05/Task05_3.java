package org.qa23.string_part2.Task05;

public class Task05_3 {
    public static void main(String[] args) {
        String text = "sdfdsf dsgsfhgh ,,.;l dgdfbdz ag..,-";
        char[] chars = text.toCharArray();
        int countSymbol = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isLetterOrDigit(chars[i]) && !Character.isSpaceChar(chars[i])) {
                countSymbol++;
            }
        }
        System.out.println("Количество знаков препинания в тексте  = " + countSymbol);
    }
}
