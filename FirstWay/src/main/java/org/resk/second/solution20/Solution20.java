package org.resk.second.solution20;
public class Solution20 {
    public static void main(String[] args) {
        CanFly canFly = new CanFly() {
            //Анонимный класс наследник
            @Override
            public void fly() {
                System.out.println("Что то летает");
            }

            @Override
            public void land() {
                System.out.println("Что то приземляется");
            }
        };
        canFly.fly();
        canFly.land();
    }

    public interface CanFly {
        void fly();

        void land();
    }
}