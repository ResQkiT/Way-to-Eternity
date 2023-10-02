package org.resk.solution28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution28{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }

    }
}