package com.math.search;

import com.math.PositiveInteger;
import junit.framework.TestCase;
import org.junit.Assert;

public class ArraysTest extends TestCase {
    int[] testArray;
    int[] expectedArray;

    public void setUp() {
        testArray = null;
        expectedArray = null;
    }

    public void testIncreasingArray(){
        testArray = IntegerArrayStub.createMonotoneIncreasingArray(1, 20, new PositiveInteger(3));
        expectedArray = new int[]{1, 4, 7, 10, 13, 16, 19};

        Assert.assertArrayEquals(expectedArray, testArray);
    }

    public void testDecreasingArray(){
        testArray = IntegerArrayStub.createMonotoneDecreasingArray(20, 1, new PositiveInteger(3));
        expectedArray = new int[]{20, 17, 14, 11, 8, 5, 2};

        Assert.assertArrayEquals(expectedArray, testArray);
    }

    public void testMonotoneArray(){
        testArray = IntegerArrayStub.createEqualElementsArray(5, new PositiveInteger(5));
        expectedArray = new int[]{5, 5, 5, 5, 5};

        Assert.assertArrayEquals(expectedArray, testArray);
    }
}
