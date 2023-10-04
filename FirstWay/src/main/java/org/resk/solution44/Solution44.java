package org.resk.solution44;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution44{
    public static void main(String[] args) {
        readData();
    }
    static Scanner sc = new Scanner(System.in);
    public static void readData(){
        ArrayList<Integer> buff = new ArrayList<>();
        try {
            while(true){
                int temp = Integer.parseInt(sc.next());
                buff.add(temp);
            }
        }catch (NumberFormatException e){
            for (Integer i: buff
            ) {
                System.out.println(i);
            }
        }
    }
}