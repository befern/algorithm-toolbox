package com.math.search;

import com.math.PositiveInteger;
import junit.framework.TestCase;
import org.junit.Assert;

public class MergeSortTest extends TestCase{
    int[] originalArray;
    MergeSort sorter;


    public void setUp() {
        originalArray = null;
        sorter        = new MergeSort();
    }

    public void testSortUnorderedShortArray(){
        originalArray = new int[] {2, 3, 9, 2, 9};
        sorter.sort(originalArray);

        Assert.assertArrayEquals(new int[] {2, 2, 3, 9, 9}, originalArray);
    }

    public void testSortEqualArray(){
        originalArray = new int[] {2, 2, 2, 2, 2};
        sorter.sort(originalArray);

        Assert.assertArrayEquals(new int[] {2, 2, 2, 2, 2}, originalArray);
    }

    public void testSortDescendingArray(){
        originalArray = new int[] {5, 4, 3, 2, 1};
        sorter.sort(originalArray);

        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, originalArray);
    }

    public void testSortMaxOrderedArray(){
        originalArray = IntegerArrayStub.createMonotoneIncreasingArray(1, 1_000_000_000, new PositiveInteger(10_000));
        int[] resultArray = IntegerArrayStub.createMonotoneIncreasingArray(1, 1_000_000_000, new PositiveInteger(10_000));
        sorter.sort(originalArray);

        Assert.assertArrayEquals(resultArray, originalArray);
    }
}
