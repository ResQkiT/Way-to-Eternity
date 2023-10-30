package org.resk.lesson4.solution31;

import java.util.Scanner;

public class Solution31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd);
    }

    private static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}