package org.resk.solution17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution17{
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}