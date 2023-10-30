package org.resk.lesson4.solution29;

import java.util.LinkedList;
import java.util.List;

public class Solution29{
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);

        //list.remove(new Double("123e-445632"));

        printListValues(list);
        proccesCastedObjects(list);


    }
    static void initList(List<Number> list){
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        //list.remove(new Double("123e-445632"));
    }
    static void printListValues(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static void proccesCastedObjects(List<Number> list){
        for (Number object : list) {
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }

}