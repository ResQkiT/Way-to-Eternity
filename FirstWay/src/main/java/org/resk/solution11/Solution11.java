package org.resk.solution11;

import java.util.ArrayList;
import java.util.List;

public class Solution11{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("роза");
        words.add("лира");
        words.add("лоза");
        words.add("зил");
        words.add("лир");
        words.add("ром");
        words.add("лом");
        words.add("хор");
        words.add("самбо");

        List<String> answer = fix(words);
        for (String word : answer) {
            System.out.println(word);
        }
    }

    public static List<String> fix(List<String> words) {
        int size = words.size();
        for (int i = 0; i < size; i++) {
            String word = words.get(i);
            if (word.contains("р") && word.contains("л")) {
                continue;
            } else if (word.contains("р")) {
                words.remove(i);
                i--;
                size--;
            } else if (word.contains("л")) {
                words.add(i, word);
                i++;
                size++;
            }
        }
        return words;
    }
}