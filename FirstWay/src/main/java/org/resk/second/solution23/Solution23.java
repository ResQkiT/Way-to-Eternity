package org.resk.second.solution23;
public class Solution23{
    public static void main(String[] args) {
        System.out.println("В задаче нечего тестировать");
    }
    public abstract class Human implements CanRun, CanSwim {
        // остальной код класса

    }

    public static interface CanRun {
        void run();
    }

    public static interface CanSwim {
        void swim();
    }
}