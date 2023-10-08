package org.resk.first.solution2;

import java.util.Scanner;

public class Solution2{
    public static void main(String[] args) {
        String[] array = new String[10];

        // Ввод строк с клавиатуры и сохранение в массиве
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 8 строк:");
        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
        }
        scanner.close();

        // Вывод содержимого массива в обратном порядке
        System.out.println("Содержимое массива в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}