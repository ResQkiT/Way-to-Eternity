package org.resk.solution14;
public class Solution14{
    public static void main(String[] args) throws InterruptedException {
        int count = 30;

        while (count >= 0) {
            System.out.println(count);
            count--;
            Thread.sleep(100); // Задержка на одну десятую секунды
        }

        System.out.println("Бум!");
    }
}