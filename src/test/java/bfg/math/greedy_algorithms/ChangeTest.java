package bfg.math.greedy_algorithms;

import junit.framework.TestCase;

public class ChangeTest extends TestCase{
    Change pocket;

    public void setUp() {
        pocket = new Change(new int[]{1, 5, 10});
    }

    public void tearDown() {
        pocket = null;
    }

    public void testMinimumChange() {
        assertTrue(pocket.getChange(1) == 1);
    }

    public void testSmallChange() {
        assertTrue(pocket.getChange(2) == 2);
    }

    public void testMediumChange() {
        assertTrue(pocket.getChange(28) == 6);
    }

    public void testMaximumChange() {
        assertTrue(pocket.getChange(1000) == 100);
    }

}
