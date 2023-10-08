package org.resk.first.solution1;

import java.util.Scanner;

public class Solution1{
    public static void initializeArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 20 чисел:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        initializeArray(array);
        int maxNumber = max(array);
        System.out.println("Максимальное число в массиве: " + maxNumber);
    }
}