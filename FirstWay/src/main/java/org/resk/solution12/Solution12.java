package org.resk.solution12;

import java.util.Scanner;

public class Solution12{
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 20 чисел:");

        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < 20; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}