package com.math.search;

import junit.framework.TestCase;

public class MajorityElementTest extends TestCase {

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
        int[] votes = ArrayStub.createMonotoneIncreasingArray(1_000_000, 1_050_000, 1);
        assertFalse(MajorityElement.hasMajorityElement(votes));
    }

    public void testMajorityMaxValues(){
        int[] votes = ArrayStub.createMonotoneIncreasingArray(1_000_000, 1_050_000, 1);

        for (int i = 0; i < votes.length; i++)
            if (votes[i] > 1_024_999) votes[i] = 1_000_000;

        assertTrue(MajorityElement.hasMajorityElement(votes));
    }
}
