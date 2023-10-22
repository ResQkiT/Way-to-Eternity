package org.resk.lesson4.solution36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution36{
    public static void main(String[] args) {
        ArrayList<Person> alPersons = new ArrayList<>();
        alPersons.add(new Person("Александр", 40));
        alPersons.add (new Person("Иван"   , 5));
        alPersons.add (new Person("Валентин", 40));
        alPersons.add (new Person("Олег",    40));
        alPersons.add (new Person("Александра", 45));
        alPersons.add (new Person("Михаил", 20));
        alPersons.add (new Person("Дора"  , 15));
        Person[] people = new Person[alPersons.size()];
        for (int i = 0; i < alPersons.size(); i++) {
            people[i] = alPersons.get(i);
        }

        Arrays.sort(people, Comparator.comparing((p1) -> p1.getAge() * 1000 + p1.getName().length()));
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
class Person{
    private  final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}