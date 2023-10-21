package org.resk.lesson4.solution7;
public class Solution7{
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.eat();
        cat.sleep();
        Cat catChild = cat.getChild();
        System.out.println(catChild.getName());

        Dog dog = new Dog();
        System.out.println(dog.getName());
        dog.eat();
        dog.sleep();
        Dog dogChild = dog.getChild();
        System.out.println(dogChild.getName());
    }

    public static abstract class Pet {
        public abstract String getName();

        public void eat() {
            System.out.println("The pet is eating");
        }

        public void sleep() {
            System.out.println("The pet is sleeping");
        }

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Cat";
        }

        @Override
        public Cat getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return "Dog";
        }

        @Override
        public Dog getChild() {
            return new Dog();
        }
    }
}