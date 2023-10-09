package org.resk.second.solution28;
public class Solution28 {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
        horse.run();
        horse.fly();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {
            System.out.println("Лошадь бежит");
        }
    }

    public static class Pegasus extends Horse implements CanFly {
        @Override
        public void fly() {
            System.out.println("Пегас летает");
        }
    }
}