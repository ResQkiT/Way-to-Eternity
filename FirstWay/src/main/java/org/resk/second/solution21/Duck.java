package org.resk.second.solution21;

public class Duck implements CanRun, CanFly, CanSwim {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
}
