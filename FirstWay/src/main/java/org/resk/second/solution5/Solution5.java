package org.resk.second.solution5;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution5{
    public static void main(String[] args) throws IOException {
        List<Character> alphabet= Arrays.asList('а',  'б',  'в',  'г', 'д',  'е',  'ё',  'ж' ,'з', 'и',  'й',  'к',  'л' , 'м' , 'н', 'о' ,'п',  'р',  'с', 'т',  'у', 'ф', 'х', 'ц','ч',  'ш',  'щ',  'ъ', 'ы',  'ь');
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            Character c;
            for (int j = 0; j < s.length(); j++) {

                c = s.charAt(j);
                if (!alphabet.contains(c)) continue;
                if(hm.containsKey(c)) hm.put(c, hm.get(c) + 1);
                else hm.put(c, 1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> iter = hm.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Character, Integer> t = iter.next();
            System.out.print(t.getKey() + " :" );
            System.out.println(t.getValue());
        }

    }
}