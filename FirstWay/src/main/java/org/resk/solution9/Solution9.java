package org.resk.solution9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution9{

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 слов:");
        for (int i = 0; i < 10; i++) {
            words.add(scanner.next());
        }

        boolean ascendingOrder = true;
        int index = 0;
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).length() < words.get(i-1).length()) {
                ascendingOrder = false;
                index = i - 1;
                break;
            }
        }

        if (ascendingOrder) {
            System.out.println("Список упорядочен по возрастанию длины строки");
        } else {
            System.out.println("Список не упорядочен по возрастанию длины строки");
            System.out.println("Индекс первого элемента, нарушающего упорядоченность: " + index);
        }
    }
}