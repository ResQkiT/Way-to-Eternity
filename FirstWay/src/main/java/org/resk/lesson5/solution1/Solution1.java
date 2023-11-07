package org.resk.lesson5.solution1;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.SplittableRandom;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Solution1{
    public static void main(String[] args)
    {

        Stream<String> streamR = Stream.of("Первый", "Элемент", "В", "Данном", "Потоке");
        Stream<String> streamF = Stream.of("Другой", "Первый", "Элемент", "В", "Потоке");
        Stream<String > emptyS = Stream.of();
        Stream<String > emptyK = Stream.of();
        System.out.println("Первый элемент: " + firstElementByReduce(streamR));
        System.out.println("Превый элемент: " + firstElementByFindFirst(streamF));
        System.out.println(firstElementByFindFirst(emptyS));
        System.out.println(firstElementByReduce(emptyK));
    }
    public static String firstElementByReduce(Stream<String> stream) {
        List<String> list = stream.toList();
        if (list.isEmpty()) {
            System.out.println("Stream is empty!");
            return "";
        }
        return list.get(0);
    }


    public static String firstElementByFindFirst(Stream<String> stream) {
        Optional<String> optional = stream.findFirst();
        if (optional.isEmpty()) {
            System.out.println("Stream is empty!");
            return "";
        }
        return optional.get();
    }
}