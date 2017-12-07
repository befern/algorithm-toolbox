package com.math.search;

import java.util.Arrays;

public class BinarySearch {

    static public int[] binarySearchWithArrays(int[] arrayToBeSearched, int[] numbersToSearch) {
        int [] indexesFound = new int[numbersToSearch.length];

        for (int i = 0; i < numbersToSearch.length; i++)
            indexesFound[i] = binarySearch(arrayToBeSearched, numbersToSearch[i]);

        return indexesFound;
    }

    public static int binarySearch(int[] arrayToBeSearched, int search) {
        int left = 0, right = arrayToBeSearched.length - 1;
        int middle = left + right / 2;

        if (arrayToBeSearched.length == 1 && search != arrayToBeSearched[0]) return -1;

        if (search == arrayToBeSearched[middle])
            return middle;
        else if (search > arrayToBeSearched[middle])
            return binarySearch(Arrays.copyOfRange(arrayToBeSearched, middle + 1, right), search);
        else
            return binarySearch(Arrays.copyOfRange(arrayToBeSearched, left, middle - 1), search);
    }
}
