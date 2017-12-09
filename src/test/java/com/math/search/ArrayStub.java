package com.math.search;

import com.math.PositiveInteger;

public class ArrayStub {

    public static int[] createMonotoneIncreasingArray(int start, int end, PositiveInteger step) {
        int[] resultArray = new int[(end - start) / step.getValue()];

        for (int i = 0; i < resultArray.length; i++) resultArray[i] = i * step.getValue() + start;

        return resultArray;
    }
}
