package org.resk.lesson4.solution30;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Solution30{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        // the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new NullPointerException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new InterruptedException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new SecurityException());
    }
}