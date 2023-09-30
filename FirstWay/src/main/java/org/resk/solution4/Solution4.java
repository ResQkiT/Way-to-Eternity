package org.resk.solution4;

import java.util.Scanner;

public class Solution4{
    public static void main(String[] args) {
        int[] houses = new int[15];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < houses.length; i++) {
            System.out.print("Введите количество жителей в доме " + i + ": ");
            houses[i] = scanner.nextInt();
        }

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < houses.length; i++) {
            if (i % 2 == 0) {
                evenSum += houses[i];
            } else {
                oddSum += houses[i];
            }
        }

        if (oddSum > evenSum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}