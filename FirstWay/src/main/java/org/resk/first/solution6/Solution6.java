package org.resk.first.solution6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.util.Arrays.sort;

public class Solution6{
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 20 чисел:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }
        // Сортировка массива в убывающем порядке
        sort(numbers);
        System.out.println("Числа в убывающем порядке:");
        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }
    }
}