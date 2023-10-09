package org.resk.second.solution25;

import javax.management.PersistentMBean;

public class Solution25 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        Toad toad = new Toad();
        duck.fly();
        duck.run();
        duck.swim();
        penguin.run();
        penguin.swim();
        toad.run();
        toad.swim();
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public static class Duck implements CanFly, CanSwim, CanRun {
        public void fly() {
            System.out.println("Утка летит");
        }

        public void swim() {
            System.out.println("Утка плавает");
        }

        public void run() {
            System.out.println("Утка бегает");
        }
    }

    public static class Penguin implements CanSwim, CanRun {
        public void swim() {
            System.out.println("Пингвин плавает");
        }

        public void run() {
            System.out.println("Пингвин бегает");
        }
    }

    public static class Toad implements CanSwim, CanRun {
        public void swim() {
            System.out.println("Жаба плавает");
        }

        public void run() {
            System.out.println("Жаба бегает");
        }
    }
}