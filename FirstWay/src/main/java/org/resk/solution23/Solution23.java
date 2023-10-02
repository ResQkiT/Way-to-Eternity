package org.resk.solution23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution23{
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }
    public static List fill(List list) {
        for(int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
        return list;
    }
    public static long getGetTimeInMs(List list) {
        long s = System.currentTimeMillis();
        get10000(list);
        long e = System.currentTimeMillis();
        return e - s;
    }
    public static void get10000(List list) {
        if(list.isEmpty()) {return;}
        int x = list.size() / 2;
        for(int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}