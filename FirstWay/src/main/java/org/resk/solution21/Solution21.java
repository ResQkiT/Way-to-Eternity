package org.resk.solution21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution21{
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }
    public static long getInsertTimeInMs(List list) {
        long s = System.currentTimeMillis();
        insert10000(list);
        long e = System.currentTimeMillis();
        return e - s;
    }
    public static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }
}