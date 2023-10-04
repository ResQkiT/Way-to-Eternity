package org.resk.solution35;

import java.util.ArrayList;

public class Solution35{
    public static void main(String[] args) {
        try{
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}