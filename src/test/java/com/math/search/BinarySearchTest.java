package com.math.search;

import org.junit.Assert;
import junit.framework.TestCase;

public class BinarySearchTest extends TestCase{
    int[] inputSearched;
    int[] numbersToSearch;
    int[] foundIndexes;


    public void setUp() {
        inputSearched = null;
        numbersToSearch = null;
    }

    public void testBinarySearchOneNumber() {
        inputSearched = new int[]{1, 5, 8, 12, 13};
        numbersToSearch = new int[]{8, 1, 23, 1, 11};

        assertEquals(BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, 3), 2);
    }

    public void testFiveNumbers() {
        inputSearched = new int[]{1, 5, 8, 12, 13};
        numbersToSearch = new int[]{8, 1, 23, 1, 11};
        foundIndexes = new int[]{2, 0, -1, 0, -1};

        Assert.assertArrayEquals(BinarySearch.binarySearchWithArrays(inputSearched, numbersToSearch), foundIndexes);
    }

    public void testMaxAmountOfNumbers() {
        inputSearched = ArrayStub.createMonotoneIncreasingArray(1, 1000000000, 1);
        numbersToSearch = ArrayStub.createMonotoneIncreasingArray(1, 1000000000, 10000);
        foundIndexes = ArrayStub.createMonotoneIncreasingArray(0, 1000000000, 10000);

        Assert.assertArrayEquals(BinarySearch.binarySearchWithArrays(inputSearched, numbersToSearch), foundIndexes);
    }
}
