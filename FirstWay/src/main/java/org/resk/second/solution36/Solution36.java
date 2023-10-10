package org.resk.second.solution36;
public class Solution36{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.move();
        dog.beEaten();
        Cat cat = new Cat();
        cat.move();
        cat.eat();
        Mouse mouse = new Mouse();
        mouse.move();
        mouse.eat();
        mouse.beEaten();
    }
    //может двигаться
    public interface Movable{
        void move();
    }//может быть съеден
    public interface Edible{
        void beEaten();
    }
    //может кого-нибудь съесть
    public interface Eat  {
        void eat();
    }
    public static class Dog implements Eat, Edible, Movable{
        @Override
        public void move() {
            System.out.println("Собака убегает");
        }

        @Override
        public void beEaten() {
            System.out.println("개가 먹혔어요");
        }

        @Override
        public void eat() {
            System.out.println("Собака кушает");
        }
    }
    public static class Cat implements Eat, Movable{
        @Override
        public void move() {
            System.out.println("Кошка убегает");
        }

        @Override
        public void eat() {
            System.out.println("Кошка кушает");
        }
    }
    public static class Mouse implements Eat, Movable, Edible{
        @Override
        public void move() {
            System.out.println("Мышь убегает");
        }

        @Override
        public void beEaten() {
            System.out.println("Мышь скушали");
        }

        @Override
        public void eat() {
            System.out.println("Мышка ест");
        }
    }
}