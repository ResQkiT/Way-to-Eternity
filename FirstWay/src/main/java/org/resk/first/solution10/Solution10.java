package org.resk.first.solution10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution10{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< 10; i++){
            words.add(scanner.next());
        }
        List<String> answer = doubleValues(words);
        for (String s : answer) {
            System.out.println(s);
        }
    }
    public static List<String> doubleValues(List<String> list){
        List<String> answer = new ArrayList<>();
        for (String o: list
             ) {
            answer.add(o);
            answer.add(new String(o));
        }
        return answer;
    }
}