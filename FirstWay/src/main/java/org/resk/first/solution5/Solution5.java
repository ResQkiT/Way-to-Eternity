package org.resk.first.solution5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution5{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 строк:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            strings.add(input);
        }

        int maxLength = 0;

        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }

        System.out.println("Самая длинная строка(ы):");

        for (String s : strings) {
            if (s.length() == maxLength) {
                System.out.println(s);
            }
        }
    }
}