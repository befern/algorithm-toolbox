package bfg.math.divide_and_conquer;

import bfg.math.IntegerArrayStub;
import bfg.math.PositiveInteger;
import junit.framework.TestCase;

public class ClosestPointsTest extends TestCase {
    int[] x, y;

    public void setUp() {
        x = null;
        y = null;
    }

    public void testTwoPoints() {
        x = new int[] {0, 3};
        y = new int[] {0, 4};

        assertEquals(5.0000, ClosestPoints.minimalDistance(x, y));
    }

    public void testEqualPoints() {
        x = new int[] {7, 1, 4, 7};
        y = new int[] {7, 100, 8, 7};

        assertEquals(0.0000, ClosestPoints.minimalDistance(x, y));
    }

    public void testCoincidingMinimalDistances() {
        x = new int[] {4, -2, -3, -1, 2, -4, 1, -1, 3, -4, 2};
        y = new int[] {4, -2, -4, 3, 3, 0, 1, -1, -1, 2, 4};

        assertEquals(1.4142, ClosestPoints.minimalDistance(x, y));
    }

    public void testMaximumNumberOfPoints() {
        x = IntegerArrayStub.createMonotoneIncreasingArray(-1_000_000_000, 0, new PositiveInteger(10_000));
        y = IntegerArrayStub.createMonotoneIncreasingArray(-1_000_000_000, 0, new PositiveInteger(10_000));

        assertEquals(10_000.0000, ClosestPoints.minimalDistance(x, y));
    }
}
