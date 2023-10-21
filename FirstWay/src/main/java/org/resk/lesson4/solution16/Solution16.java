package org.resk.lesson4.solution16;
public class Solution16{
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        java.awt.Color getColor();
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox ";
        }

        @Override
        public java.awt.Color getColor() {
            return null;
        }
    }

    public static class BigFox extends Fox {

    }
}