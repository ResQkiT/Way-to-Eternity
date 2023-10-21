package org.resk.lesson4.solution37;
public class Solution37{
    public static void main(String[] args) {
        new LuxuriousCar().printlnDesire();
        new CheapCar().printlnDesire();
        new Ferrari().printlnDesire();
        new Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println("" + Constants.WANT_STRING+ Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println("" +  Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }
    public static class LuxuriousCar {
        public void printlnDesire() {
            System.out.println("" + Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }
    public static class CheapCar {
        public void printlnDesire() {
            System.out.println("" + Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }


    public enum Constants {
        WANT_STRING("Я хочу ездить на "),
        LUXURIOUS_CAR("роскошной машине"),
        CHEAP_CAR("дешевой машине"),
        FERRARI_NAME("Феррари"),
        LANOS_NAME("Ланосе");

        private final String value;

        Constants(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}