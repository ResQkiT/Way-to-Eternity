package org.resk.lesson5.solution3;

import java.util.stream.Stream;

public class Solution3{
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Первый", "элемент", "в" , "данном", "потоке");
        System.out.println("Последний элемент: " + lastElement(stream));
    }
    public static <T> T lastElement(Stream<T> stream){
        T lastElement = (T) stream.reduce((x, y) -> y).get();
        return lastElement;
    }

}

