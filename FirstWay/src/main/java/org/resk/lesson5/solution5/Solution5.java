package org.resk.lesson5.solution5;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution5{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String word = scanner.next();
        char ch = scanner.next().charAt(0);

        System.out.println(count(word, ch));
    }
    public static long count(String word, char ch){
        IntStream stream = word.chars();
        long count = stream.filter(x -> x == ch).count();
        return count;

    }
}