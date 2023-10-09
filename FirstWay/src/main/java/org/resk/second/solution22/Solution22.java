package org.resk.second.solution22;
public class Solution22{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.move();
        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.move();
        Car car = new Car();
        car.eat();
        car.move();
        Airplane airplane = new Airplane();
        airplane.eat();
        airplane.fly();
        airplane.move();
    }

    public static class Dog implements CanEat, CanMove{
        @Override
        public void eat() {
            System.out.println("Собака есть");
        }

        @Override
        public void move() {
            System.out.println("Собака бежит");
        }
    }
    public static class Duck implements CanFly, CanEat{
        @Override
        public void eat() {
            System.out.println("Утка есть");
        }

        @Override
        public void fly() {
            System.out.println("Утка летает");
        }

        @Override
        public void move() {
            System.out.println("Утка двигается");
        }
    }
    public static class Car implements CanMove, CanEat{
        @Override
        public void eat() {
            System.out.println("Машина ест бензин");
        }

        @Override
        public void move() {
            System.out.println("Машина едет");
        }
    }
    public static class Airplane implements CanEat, CanFly{
        @Override
        public void eat() {
            System.out.println("Самолет ест топливо");
        }

        @Override
        public void fly() {
            System.out.println("Самолет летает");
        }

        @Override
        public void move() {
            System.out.println("Самолет двигается");
        }
    }
}