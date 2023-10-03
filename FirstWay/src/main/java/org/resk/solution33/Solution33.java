package org.resk.solution33;
public class Solution33{
    public static void main(String[] args) {
        log("Привет");
    }
    public static void log(String massage){
        String className = Thread.currentThread()
                .getStackTrace()[1]
                .getClassName();
        String FName = Thread.currentThread()
                .getStackTrace()[2].getMethodName();
        System.out.println("Текущий класс " + className);
        System.out.println("Текущая функция " + FName);
        System.out.println("Сообщение: " + massage);
    }
}