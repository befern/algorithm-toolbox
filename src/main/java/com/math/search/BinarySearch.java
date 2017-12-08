package com.math.search;


public class BinarySearch {

    static public int[] binarySearchWithArrays(int[] arrayToBeSearched, int[] numbersToSearch) {
        int [] indexesFound = new int[numbersToSearch.length];

        for (int i = 0; i < numbersToSearch.length; i++)
            indexesFound[i] = binarySearch(arrayToBeSearched, 0, arrayToBeSearched.length -1, numbersToSearch[i]);

        return indexesFound;
    }

    public static int binarySearch(int[] arrayToBeSearched, int low, int high, int key) {
        int middle = low + (high - low) / 2;

        if (high < low) return - 1;
        if (key == arrayToBeSearched[middle])return middle;

        else if (key < arrayToBeSearched[middle]) return binarySearch(arrayToBeSearched, low, middle - 1, key);
        else return binarySearch(arrayToBeSearched, middle + 1, high, key);



    }
}
