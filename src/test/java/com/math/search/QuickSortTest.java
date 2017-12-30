package com.math.search;

import com.math.PositiveInteger;
import junit.framework.TestCase;
import org.junit.Assert;

public class QuickSortTest extends TestCase{
    int[] originalArray;

    public void testQuickSort1Element(){
        originalArray = new int[] {2};
        QuickSort.randomizedQuickSort(originalArray, 0, originalArray.length - 1);

        Assert.assertArrayEquals(new int[] {2}, originalArray);
    }

    public void testQuickSort3Elements(){
        originalArray = new int[] {3, 2 , 4};
        QuickSort.randomizedQuickSort(originalArray, 0, originalArray.length - 1);

        Assert.assertArrayEquals(new int[] {2, 3, 4}, originalArray);
    }

    public void testQuickSort5Elements(){
        originalArray = new int[] {2, 3, 9, 2, 2};
        QuickSort.randomizedQuickSort(originalArray, 0, originalArray.length - 1);

        Assert.assertArrayEquals(new int[] {2, 2, 2, 3, 9}, originalArray);
    }

    public void testQuickSortEqualMaxElements(){
        originalArray = IntegerArrayStub.createEqualElementsArray(1_000_000_000, new PositiveInteger(10_000));
        QuickSort.randomizedQuickSort(originalArray, 0, originalArray.length - 1);

        Assert.assertArrayEquals(originalArray, originalArray);
    }

    public void testQuickSortDifferentMaxElements(){
        originalArray = IntegerArrayStub.createMonotoneIncreasingArray(1_000, 20_000, new PositiveInteger(5));
        originalArray[originalArray.length - 1] = 1;

        int[] sortedArray = IntegerArrayStub.createMonotoneIncreasingArray(995, 19_995, new PositiveInteger(5));
        sortedArray[0] = 1;

        QuickSort.randomizedQuickSort(originalArray, 0, originalArray.length - 1);

        Assert.assertArrayEquals(sortedArray, originalArray);
    }
}
