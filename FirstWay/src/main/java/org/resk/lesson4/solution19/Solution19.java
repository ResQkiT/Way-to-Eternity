package org.resk.lesson4.solution19;

import java.util.Scanner;

public class Solution19{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals("")){
            System.out.println(CatFactory.getCatByKey(s).toString());
            s = sc.nextLine();
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch(key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }
        @Override
        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }
        @Override
        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}