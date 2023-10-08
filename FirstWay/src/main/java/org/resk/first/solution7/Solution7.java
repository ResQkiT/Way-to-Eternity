package org.resk.first.solution7;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution7{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 строк:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            strings.add(input);
        }

        for (int i = 0; i < 13; i++) {
            String last = strings.remove(strings.size() - 1);
            strings.add(0, last);
        }

        System.out.println("Содержимое списка:");

        for (String s : strings) {
            System.out.println(s);
        }
    }
}