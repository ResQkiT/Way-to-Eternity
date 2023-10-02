package org.resk.solution26;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution26{
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Smith", "John");
        map.put("Johnson", "Robert");
        map.put("Williams", "John");
        map.put("Jones", "William");
        map.put("Brown", "David");
        map.put("Davis", "James");
        map.put("Miller", "Charles");
        map.put("Wilson", "John");
        map.put("Moore", "Thomas");
        map.put("Taylor", "Daniel");

        return  map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> s = map.values().stream().toList();
        for (String name: s
             ) {
            removeItemFromMapByValue(map, name);
        }
    }


    public static void removeItemFromMapByValue(Map<String,String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String  > mp = createMap();
        System.out.println(mp);
        removeTheFirstNameDuplicates(createMap());
        System.out.println(mp);
    }
}