package org.resk.second.solution31;
public class Solution31 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> simpleObject = new StringObject();
        System.out.println(simpleObject);
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }
}