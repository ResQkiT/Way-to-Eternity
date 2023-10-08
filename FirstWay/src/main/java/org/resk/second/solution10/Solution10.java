package org.resk.second.solution10;
public class Solution10{
    public static void main(String[] args) {
        System.out.println("Задача не нуждается в выводе см код.");
    }
    //Иммутабельный класс?
    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        private String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        private int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}