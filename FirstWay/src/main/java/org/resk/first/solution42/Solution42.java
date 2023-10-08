package org.resk.first.solution42;
public class Solution42{
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
    public static void divideByZero() {
        int result;
        try {
            result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}