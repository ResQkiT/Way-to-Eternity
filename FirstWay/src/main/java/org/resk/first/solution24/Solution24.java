package org.resk.first.solution24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            if (! hm.containsKey(temp)){
                hm.put(temp , 1);
            }else{
                int s = hm.get(temp) + 1 ;
                hm.put(temp, s);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iter = hm.entrySet().iterator();

        int max = -1;
        while (iter.hasNext()){
            int llll =iter.next().getValue();
            if (llll > max){
                max = llll;
            }
        }
        System.out.println(max);
    }
}
