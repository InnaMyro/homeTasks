package org.qa23.string_part2.Task05;

public class Task05_1 {
    public static void main(String[] args) {
        String text = "dfdg gfh fg. ghfg hfghfsdf. etertyuyuytj. sfh gh jgjg h";
        String[] partText = text.split("\\.");
        String result = "";
        for (int i = 0; i < partText.length; i++) {
            result += partText[i].trim().substring(0, 1).toUpperCase() + partText[i].trim().substring(1) + ". ";
        }
        System.out.println("Текст до преобразования: " + text);
        System.out.println("Текст после преобразования: " + result);
    }
}
