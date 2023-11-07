package org.resk.lesson5.solution12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        int stInd = scanner.nextInt();
        int endInd = scanner.nextInt();

        Stream<Integer> intStream = list.stream();
        System.out.println("List: " + list);

        Stream<Integer> sliceOfIntStream = getSlice(intStream, stInd, endInd);
        System.out.println("Stream:");
        sliceOfIntStream.forEach(System.out::println);
    }

    public static <T> Stream<T> getSlice(Stream<T> stream, int stInd, int endInd) {
        return stream.skip(stInd).limit(endInd - stInd + 1);
    }
}