package org.resk.lesson4.solution1;
public class Solution1 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();
        System.out.println(cat);
        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
        System.out.println(dog);
    }

    public abstract static class Pet {
        public abstract   Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return  new Dog();
        }
    }
}