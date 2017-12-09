package com.math.search;

import com.math.PositiveInteger;
import junit.framework.TestCase;

public class MajorityElementTest extends TestCase {
    PositiveInteger addOne = new PositiveInteger(1);

    public void testNoMajority(){
        assertFalse(MajorityElement.hasMajorityElement(new int[] {1, 2, 3, 4}));
    }

    public void testMajorityByOne(){
        assertTrue(MajorityElement.hasMajorityElement(new int[] {2, 3, 9, 2, 2}));
    }

    public void testSimpleMajority(){
        assertFalse(MajorityElement.hasMajorityElement(new int[] {1, 2, 3, 1}));
    }

    public void testNoMajorityMaxValues(){
        int[] votes = IntegerArrayStub.createMonotoneIncreasingArray(1_000_000, 1_050_000, addOne);
        assertFalse(MajorityElement.hasMajorityElement(votes));
    }

    public void testMajorityMaxValues(){
        int[] votes = IntegerArrayStub.createMonotoneIncreasingArray(1_000_000, 1_050_000, addOne);

        for (int i = 0; i < votes.length; i++)
            if (votes[i] > 1_024_999) votes[i] = 1_000_000;

        assertTrue(MajorityElement.hasMajorityElement(votes));
    }
}
