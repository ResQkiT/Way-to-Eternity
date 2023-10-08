package org.resk.first.solution18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution18{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, String > temp = iter.next();
            System.out.println(temp.getKey() + " - " + temp.getValue());
        }
    }
}