package org.resk.first.solution8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution8{
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 слов:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            words.add(input);
        }

        words.remove(2); // Удаляем 3-ий элемент

        Collections.reverse(words); // Обратный порядок списка

        System.out.println("Оставшиеся элементы в обратном порядке:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}