package org.resk.lesson4.solution2;
public class Solution2{
    public static void main(String[] args) {
        //Задача 2, 3, 4
        int number = 5;
        double d = 2.3;
        long r = 100000000;
        StringBuilder sb = new StringBuilder().append("Я диктор канала").append("Мастерская настроения");
        String s = "привет";
        print(number);
        print(s);
        print(d);
        print(r);
        print(sb);
    }
    public static void print(int a){
        System.out.println("Вывожу число: " + a );
    }
    public static  void print(String s){
        System.out.println("Вывожу строку: " + s);
    }
    public static void print(double d){
        System.out.println("Вывожу double: " + d);
    }
    public  static void print(long l){
        System.out.println("Вывожу long: " + l);
    }
    public static void print(StringBuilder sb){
        System.out.println("Вывожу стрингбилдер: " + sb.toString());
    }
}