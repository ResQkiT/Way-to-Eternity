package org.resk.lesson4.solution26;

import java.util.ArrayList;
import java.util.List;

public class Solution26{
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //apartments.stream().forEach(Apartment::clean);
        //сначала сделал задание, а потом увидел следующее
        for (Apartment a: apartments
             ) {
            if (a instanceof OneRoomApt){
                ((OneRoomApt) a).clean1Room();
            } else if (a instanceof  TwoRoomApt) {
                ((TwoRoomApt) a).clean2Rooms();
            } else if (a instanceof  ThreeRoomApt) {
                ((ThreeRoomApt) a).clean3Rooms();
            }
        }
    }

    static interface Apartment {
        public void clean();
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }

        @Override
        public void clean() {
            clean1Room();
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }

        @Override
        public void clean() {
            clean2Rooms();
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }

        @Override
        public void clean() {
            clean3Rooms();
        }
    }
}