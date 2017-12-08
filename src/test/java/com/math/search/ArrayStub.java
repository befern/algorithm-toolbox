package com.math.search;

public class ArrayStub {

    public static int[] createMonotoneIncreasingArray(int start, int end, int step) {
        if (step <= 0) throw new IllegalArgumentException("Step cannot be lower than 1 in a monotone increasing array");

        int[] resultArray = new int[(end - start) / step];

        for (int i = 0; i < resultArray.length; i++) resultArray[i] = i * step + start;

        return resultArray;
    }
}
