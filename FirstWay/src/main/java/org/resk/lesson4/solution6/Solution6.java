package org.resk.lesson4.solution6;
public class Solution6{
    public static void main(String[] args) {
        Cow cow = new Cow();
        System.out.println(cow.getName());
        cow.eat();
        cow.sleep();
        cow.sound();
    }

    public static abstract class Animal {
        public abstract String getName();

        public void eat() {
            System.out.println("The animal is eating");
        }

        public void sleep() {
            System.out.println("The animal is sleeping");
        }
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Cow";
        }

        public void sound() {
            System.out.println("The cow is mooing");
        }
    }
}