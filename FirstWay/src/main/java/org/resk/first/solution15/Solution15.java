package org.resk.first.solution15;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution15 {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите имя кошки:");
            String name = reader.readLine();

            if (name == null || name.isEmpty()) {
                break;
            }

            System.out.println("Введите возраст кошки:");
            int age = Integer.parseInt(reader.readLine());

            System.out.println("Введите вес кошки:");
            int weight = Integer.parseInt(reader.readLine());

            System.out.println("Введите длину хвоста кошки:");
            int tail = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tail);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        public Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
