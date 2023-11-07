package org.resk.lesson5.solution8;
import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Изначальный массив: " + Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс для удаления: ");
        int index = scanner.nextInt();

        arr = removeElem(arr, index);
        System.out.println("Итоговый массив: " + Arrays.toString(arr));
    }

    public static int[] removeElem(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            return IntStream.range(0, arr.length)
                    .filter(i -> i != index)
                    .map(i -> arr[i])
                    .toArray();
        } else {
            System.out.println("Плохой индекс!");
            return arr;
        }
    }
}