package org.resk.second.solution27;
public class Solution27 {
    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
        System.out.println("Программа компилируется без изменений");
    }

    public static interface CanFly {
        public void fly();
    }

    public static abstract class Horse {
        public void run() {}
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {
        }
    }

    public static class SwimmingPegasus extends Pegasus {
        public void swim() {
        }
    }
}