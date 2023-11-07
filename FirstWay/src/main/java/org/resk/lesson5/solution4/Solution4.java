package org.resk.lesson5.solution4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution4{
    public static <T>Set<T> findDublicates(Stream<T> stream){
        HashMap<T , Integer> map = new HashMap();
        //Перепишу решение позже
        Set<T> set = stream.peek((x) -> {
            if (map.get(x) != null){
                map.put(x , map.get(x)+1);
            }else{
                map.put(x , 1);
            }
        }).filter(x -> {
            return map.get(x) >= 2;
        }).collect(Collectors.toSet());
        return set;
    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        System.out.println(findDublicates(stream));
    }
}