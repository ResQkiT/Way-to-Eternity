package org.resk.second.solution34;
public class Solution34 {
    public static void main(String[] args) throws Exception {
        System.out.println("Смотреть код");
    }

    interface Person{
        void use(Person person);
        void startToWork();
    }

    interface HasManagementPotential extends Person {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends HasManagementPotential {
    }

    class Manager implements Secretary, Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Person {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}