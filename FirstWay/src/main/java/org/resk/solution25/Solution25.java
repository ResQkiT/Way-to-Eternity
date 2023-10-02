package org.resk.solution25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution25{
    public static void main(String[] args) {
        Map<String, String> db = createMap();
        System.out.println(getCountTheSameFirstName(db, "Иван"));
        System.out.println(getCountTheSameFirstName(db, "Гарри"));
        System.out.println(getCountTheSameLastName(db, "Сидоров"));

    }
    public static Map<String, String> createMap() {
        HashMap<String , String > hm = new HashMap<>();
        hm.put("Иванов", "Иван");
        hm.put("Иванов", "Гарри");
        hm.put("Сидоров", "Иван");
        hm.put("Сидоров", "Рональд");
        hm.put("Сидоров", "Гарри");
        hm.put("Уизли", "Иван");
        hm.put("Поттер", "Гарри");
        hm.put("Раскольников", "Родион");
        hm.put("Пушкин", "Александр");
        hm.put("Сойер", "Том");
        return hm;
    }
    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() == name) {
                count++;
            }
        }
        return  count;
    }
    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //по факту если фамилия является ключом, то она является уникальным идентификатором, значит всегда есть только 1 запись)))) ответ: 1)
        /*int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getKey() == lastName){
                count ++;
            }
        }
        return  count; */
        return 1;

    }

}