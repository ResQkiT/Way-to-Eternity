package org.resk.lesson4.solution22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution22{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        // тут цикл по чтению ключей
        while ((key = reader.readLine()) != null) {
            person = switch (key){
                case "user" -> new Person.User();
                case "loser" -> new Person.Loser();
                case "coder" -> new Person.Coder();
                case "proger" -> new Person.Proger();
                default -> null;
            };
            if (person == null){
                break;
            }

            doWork(person); // вызываем doWork
        }
    }

    public static void doWork(Person person) {
        switch (person.getClass().getSimpleName()) {
            case "User":
                ((Person.User) person).live();
                break;
            case "Loser":
                ((Person.Loser) person).doNothing();
                break;
            case "Coder":
                ((Person.Coder) person).writeCode();
                break;
            case "Proger":
                ((Person.Proger) person).enjoy();
                break;
        }
    }

    public interface Person {
        class User implements Person {
            void live() {
                System.out.println("I usually just live.");
            }
        }

        class Loser implements Person {
            void doNothing() {
                System.out.println("I usually do nothing.");
            }
        }

        class Coder implements Person {
            void writeCode() {
                System.out.println("I usually write code.");
            }
        }

        class Proger implements Person {
            void enjoy() {
                System.out.println("It's a wonderful life!");
            }
        }
    }
}