package org.resk.solution22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution22{
    public static List getListForGet() {
        return new ArrayList();
    }
    public static List getListForSet() {
        return new ArrayList();
    }
    public static List getListForAddOrInsert() {
        return new LinkedList();
    }
    public static List getListForRemove() {
        return new LinkedList();
    }
    public static void main(String[] args) {
        System.out.println(getListForGet().getClass());
        System.out.println(getListForSet().getClass());
        System.out.println(getListForAddOrInsert().getClass());
        System.out.println(getListForRemove().getClass());
    }
}