package org.resk.lesson5.solution6;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Solution6{
    public static void main(String[] args) {
        Stream<Integer>
                stream = Stream.of(1, 2, 3, 4, 5);
        ArrayList<Integer> alFromStream = getALFromStream(stream);
        System.out.println("ArrayList: " + alFromStream);
    }

    private static <T> ArrayList<T> getALFromStream(Stream<T> stream) {
        return new ArrayList<T>(stream.toList());
    }
}