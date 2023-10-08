package org.resk.first.solution13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution13{
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки (для завершения введите 'end'):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            strings.add(input);
        }

        System.out.println("Строки:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}