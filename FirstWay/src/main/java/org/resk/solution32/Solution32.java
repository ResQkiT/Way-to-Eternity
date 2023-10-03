package org.resk.solution32;
public class Solution32{
    public static void main(String[] args) {
        int depth = getStackTraceDepth();
        System.out.println("Глубина стек-трейса: " + depth);
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int depth = stackTrace.length;
        System.out.println("Количество методов в стек-трейсе: " + depth);
        return depth;
    }
}