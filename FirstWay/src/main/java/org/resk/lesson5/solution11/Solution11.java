package org.resk.lesson5.solution11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution11{
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 1, 3, 2, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int num = scanner.nextInt();
        System.out.println("Индекс числа " + num + ": " + findIndex(arr, num));
    }

    public static int findIndex(int[] arr, int t) {
        return Arrays.stream(arr)
                .boxed()
                .toList()
                .indexOf(t);
    }
}