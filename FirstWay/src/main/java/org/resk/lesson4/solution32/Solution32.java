package org.resk.lesson4.solution32;
public class Solution32{
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        Hen hen3 = HenFactory.getHen(Country.MOLDOVA);
        Hen hen4 = HenFactory.getHen(Country.UKRAINE);
        //hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());
        System.out.println(hen4.getDescription());
    }

    static class HenFactory {
        static Hen getHen(Country country) {
            Hen hen = null;
            hen = switch (country){
                case RUSSIA -> new RussianHen();
                case BELARUS -> new BelarusHen();
                case MOLDOVA -> new MoldovianHen();
                case UKRAINE -> new UkrainianHen();
            };
            return hen;
        }
    }

    public enum Country {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        MOLDOVA("Moldova"),
        BELARUS("Belarus");

        private final String title;

        Country(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}