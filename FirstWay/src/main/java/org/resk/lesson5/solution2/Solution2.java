package org.resk.lesson5.solution2;

import java.util.stream.Stream;

public class Solution2{
    public static void main(String[] args) {
        Stream<String> streamR = Stream.of("Первый", "элемент", "в" , "данном", "потоке");
        Stream<Integer> streamF = Stream.of(1 ,2 , 3, 4 ,5, 6 ,7);
        System.out.println("Первый элемент: " + firstElement(streamR));
        System.out.println("Превый элемент: " + firstElement(streamF));
    }
    public static <T> T firstElement(Stream<T> stream){
        T first_element = stream.findFirst().orElse(null);
        return first_element;
    }
}