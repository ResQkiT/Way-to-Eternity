package org.resk.lesson4.solution15;
public class Solution15{
    public static void main(String[] args) {
        SimpleObject<String> stringSimpleObject = new StringObject();
        System.out.println(stringSimpleObject);
    }
    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }


    public static class StringObject implements SimpleObject<String>{
        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }
}