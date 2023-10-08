package org.resk.second.solution3;
public class Solution3{
    public static void main(String[] args) {
        float f = (float) 128.5;
        int i = (int) f;
        int b = (byte) (i + f);
        System.out.println(b);
    }
}