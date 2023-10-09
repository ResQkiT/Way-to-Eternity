package org.resk.second.solution26;
public class Solution26 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        cto.workHard();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public static class IT implements Businessman{
        @Override
        public void workHard() {
            System.out.println("Работа кипит");
        }
    }

    public static class CTO extends IT implements Businessman {

    }
}