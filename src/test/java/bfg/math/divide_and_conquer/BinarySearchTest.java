package bfg.math.divide_and_conquer;

import bfg.math.PositiveInteger;
import bfg.math.IntegerArrayStub;
import org.junit.Assert;
import junit.framework.TestCase;

public class BinarySearchTest extends TestCase{
    int[] inputSearched;
    int[] numbersToSearch;
    int[] foundIndexes;


    public void setUp() {
        inputSearched = null;
        numbersToSearch = null;
        foundIndexes = null;
    }

    public void testBinarySearchOneNumber() {
        assertEquals(3, BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, 0, 5, 4));
    }

    public void testBinarySearchLargerNumber() {
        assertEquals(-1, BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, 0, 4, 20));
    }

    public void testBinarySearchSmallerNumber() {
        assertEquals(-1, BinarySearch.binarySearch(new int[] {2, 3, 4, 5}, 0, 5, 1));
    }

    public void testFiveNumbers() {
        inputSearched = new int[]{1, 5, 8, 12, 13};
        numbersToSearch = new int[]{8, 1, 23, 1, 11};
        foundIndexes = new int[]{2, 0, -1, 0, -1};

        Assert.assertArrayEquals(foundIndexes, BinarySearch.binarySearchWithArrays(inputSearched, numbersToSearch));
    }

    public void testMaxAmountOfNumbers() {
        inputSearched = IntegerArrayStub.createMonotoneIncreasingArray(1, 10000000, new PositiveInteger(1));
        numbersToSearch = IntegerArrayStub.createMonotoneIncreasingArray(1, 90001, new PositiveInteger(100));
        foundIndexes = IntegerArrayStub.createMonotoneIncreasingArray(0, 90001, new PositiveInteger(100));

        Assert.assertArrayEquals(foundIndexes, BinarySearch.binarySearchWithArrays(inputSearched, numbersToSearch));
    }
}
