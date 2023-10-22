package org.resk.lesson4.solution34;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution34{
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
        final Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        };
        Arrays.sort(people, comparator);
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