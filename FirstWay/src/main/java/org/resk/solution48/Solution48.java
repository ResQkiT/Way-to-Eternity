package org.resk.solution48;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution48{
    public static void main(String[] args) {
        ArrayList<String> a = (ArrayList<String>) Arrays.asList(args);
        Object[] r = Arrays.stream(args).min(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = Integer.parseInt(o1);
                int b = Integer.parseInt(o2);
                return (a >= b) ? 1: -1;
            }
        }).stream().toArray();
        System.out.println(r[0] + " "+ r[r.length - 1]);
    }
}