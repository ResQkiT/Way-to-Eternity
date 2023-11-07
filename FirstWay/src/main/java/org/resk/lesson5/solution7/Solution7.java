package org.resk.lesson5.solution7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Character> chars = convertStrToCharList(str);
        System.out.println(chars);
     }

    private static List<Character> convertStrToCharList(String str) {
        ArrayList<Character> arrayList= new ArrayList<>();
        str.chars().forEach((x)->{
            arrayList.add((char) x);
        });
        return arrayList;
    }
}