package com.math.search;

public class ArrayStub {

        public static int[] createMonotoneIncreasingArray(int start, int end, int step) {
            int[] resultArray = new int[start + end / step];

            for (int i = 0; i < resultArray.length; i++) resultArray[i] = i * step + start;

            return resultArray;
        }
    }
