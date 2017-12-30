package bfg.math.greedy_algorithms;

import junit.framework.TestCase;

public class FractionalKnapsackTest extends TestCase{
    FractionalKnapsack testKnapsack1;
    FractionalKnapsack testKnapsack2;
    FractionalKnapsack testKnapsack3;
    FractionalKnapsack testKnapsack4;

    public void setUp() {
        testKnapsack1 = new FractionalKnapsack(0);
        testKnapsack2 = new FractionalKnapsack(50);
        testKnapsack3 = new FractionalKnapsack(10);
        testKnapsack4 = new FractionalKnapsack(2000000);
    }

    public void tearDown() {
        testKnapsack1 = null;
        testKnapsack2 = null;
        testKnapsack3 = null;
        testKnapsack4 = null;
    }

    public void testSmallestKnapsack(){
       double smallestSackValue = testKnapsack1.getOptimalValue(new int[]{20, 30, 1}, new int[]{1, 0, 20});
        assertEquals(0.0000, smallestSackValue);
    }

    public void testKnapsackWithSomeItems(){
        double knapsackValue = testKnapsack2.getOptimalValue(new int[]{60, 100, 120}, new int[]{20, 50, 30});
        assertEquals(180.0000, knapsackValue, 0.0001);
    }

    public void testKnapsackWithOneItem(){
        double knapsackValue = testKnapsack3.getOptimalValue(new int[]{500}, new int[]{30});
        assertEquals(166.6667,knapsackValue, 0.0001);
    }

    public void testKnapsackWithMaxValues(){
        double knapsackValue = testKnapsack4.getOptimalValue(new int[1000], new int[1000]);
        assertEquals(0.000,knapsackValue, 0.0001);
    }

    public void testKnapsackWithRepeatedDensities(){
        double knapsackValue = testKnapsack2.getOptimalValue(new int[]{60, 120, 120}, new int[]{20, 40, 130});
        assertEquals(150.000,knapsackValue, 0.0001);
    }
}
