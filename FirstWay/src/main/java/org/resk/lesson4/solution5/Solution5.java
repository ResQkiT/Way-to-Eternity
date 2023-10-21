package org.resk.lesson4.solution5;
public class Solution5{
    public static void main(String[] args) {
        int minIntResult = min(10, 5);
        long minLongResult = min(20L, 30L);
        double minDoubleResult = min(3.14, 2.71);

        System.out.println("Minimum of 10 and 5 is: " + minIntResult);
        System.out.println("Minimum of 20 and 30 is: " + minLongResult);
        System.out.println("Minimum of 3.14 and 2.71 is: " + minDoubleResult);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static long min(long a, long b) {
        return Math.min(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }
}