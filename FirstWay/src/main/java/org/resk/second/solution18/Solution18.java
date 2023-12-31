package org.resk.second.solution18;

public class Solution18 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        Pair<Integer, Integer> result = getMinimumAndMaximum(data);
        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        Pair<Integer, Integer> minnmax = new Pair<>(99999999, -999999999);
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < minnmax.x) minnmax.x = inputArray[i];
            if(inputArray[i] > minnmax.y) minnmax.y = inputArray[i];

        }

        // напишите тут ваш код
        return minnmax;
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}