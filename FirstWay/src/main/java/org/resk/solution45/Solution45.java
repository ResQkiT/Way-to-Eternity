package org.resk.solution45;

import java.util.Scanner;

public class Solution45{
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String vowelsString = "";
        String consonantsString = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') continue;
            if (isVowel(c)) {
                vowelsString += c + " ";
            } else {
                consonantsString += c + " ";
            }
        }

        System.out.println(vowelsString);
        System.out.println(consonantsString);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}