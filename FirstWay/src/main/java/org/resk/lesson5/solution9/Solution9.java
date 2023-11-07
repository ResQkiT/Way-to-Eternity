package org.resk.lesson5.solution9;
import java.util.Arrays;
import java.util.stream.Stream;

public class Solution9 {
    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, 2, 3};
        Integer[] b = new Integer[] {4, 5, 6};
        Object[] c = concatenate(a, b);
        System.out.println("Результат: " + Arrays.toString(c));
    }

    public static <T> Object[] concatenate(T[] a, T[] b) {
        return Stream.concat(Arrays.stream(a), Arrays.stream(b))
                .toArray(Object[]::new);
    }
}