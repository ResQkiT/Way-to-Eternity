package org.resk.solution30;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution30{
    public static void main(String[] args) {
        Human child1 = new Human("Ребенок 1" , 12, true, null),
                child2 = new Human("Ребенок 2" , 13, false, null),
                child3 = new Human("Ребенок 3" , 14, true, null);
        Human mother = new Human("Отец", 32, true, new ArrayList<>(Arrays.asList(new Human[]{child1, child2, child3}))),
                father = new Human("Мать", 31, false,new ArrayList<>(Arrays.asList(new Human[]{child1, child2, child3})) );
        Human grandfa = new Human("Дедушка", 72, true, new ArrayList<>(Arrays.asList(new Human[]{mother, father}))),
                grandma = new Human("Бабушка", 71, false, new ArrayList<>(Arrays.asList(new Human[]{mother, father})));
        System.out.println("Геологическое дерево");
        System.out.println(grandfa);
        System.out.println(grandma);
        System.out.println("~~~~~~~");
        System.out.println(father);
        System.out.println(mother);
        System.out.println("~~~~~~~");
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }
}
class Human{
    public String name;
    public int age;
    public boolean sex;
    public ArrayList<Human> children;

    public Human(String name, int age, boolean sex, ArrayList<Human> children) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.children = children;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        int childCount =this.children != null? this.children.size():0;
        if (childCount > 0) {
            text += ", дети: " + this.children.get(0).name;
            for (int i = 1; i < childCount; i++) {
                Human child = this.children.get(i);
                text += ", " + child.name;
            }
        }

        return text;
    }
}