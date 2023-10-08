package org.resk.second.solution6;

import java.util.ArrayList;

public class Solution6{
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] matrix= new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            ArrayList<String> temp = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                temp.add(j + " элемент в списке "+ i);
            }
            matrix[i] = (ArrayList<String>) temp.clone();
            temp.clear();
        }


        return matrix;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}