package org.qa23.string_part2.Task05;

public class Task05_4 {
    public static void main(String[] args) {
        String text = "dfdg gfh fg. ghfg hfghfsdf. etertyuyuytj. sfh gh jgjg h";
        String[] partText = text.split("\\.");
        System.out.println("Количество предложений в тексте = " + partText.length);
    }
}
