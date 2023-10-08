package org.resk.first.solution3;

import java.util.Scanner;

public class Solution3{
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        // Ввод строк с клавиатуры и сохранение в массиве строк
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 строк:");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }
        scanner.close();

        // Заполнение массива чисел длинами строк из массива строк
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = stringArray[i].length();
        }

        // Вывод содержимого массива чисел
        System.out.println("Содержимое массива чисел:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}