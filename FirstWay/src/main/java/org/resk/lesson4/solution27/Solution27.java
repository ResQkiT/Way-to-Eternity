package org.resk.lesson4.solution27;

import java.util.ArrayList;
import java.util.List;

public class Solution27{
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        apartments.forEach(Apartment::cleanRooms);
    }

    static interface Apartment {
        void cleanRooms();
    }

    static class OneRoomApt implements Apartment {
        public void cleanRooms() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        public void cleanRooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        public void cleanRooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}