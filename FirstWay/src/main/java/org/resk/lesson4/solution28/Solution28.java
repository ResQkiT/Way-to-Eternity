package org.resk.lesson4.solution28;

import java.util.ArrayList;
import java.util.List;

public class Solution28{
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Ruble(500.0));
            allMoney.add(new Hryvnia(20.0));
            allMoney.add(new USD(20000.0));
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }

}