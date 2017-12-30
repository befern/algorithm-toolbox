package bfg.math.greedy_algorithms;

import java.util.TreeMap;

public class FractionalKnapsack {
    private int capacity;

    public FractionalKnapsack(int capacity) {
        this.capacity = capacity;
    }

    public double getOptimalValue(int[] values, int[] weights) {
        int sackWeight = 0;
        double sackValue = 0;

        TreeMap<Double, Integer> amountsOfDensityValues = GreedyMath.itemsForDensityMap(values, weights);

        while (sackWeight < capacity && !amountsOfDensityValues.isEmpty()){
            int    capacityLeft  = capacity - sackWeight;
            double itemDensity   = amountsOfDensityValues.firstKey();
            int    itemWeight    = amountsOfDensityValues.get(itemDensity);
            double fullItemValue = itemDensity * amountsOfDensityValues.get(itemDensity);

            if (capacityLeft >= itemWeight) {
                sackWeight += itemWeight;
                sackValue += fullItemValue;
                amountsOfDensityValues.remove(itemDensity);
            } else {
                sackValue += itemDensity * capacityLeft;
                sackWeight += capacityLeft;
            }
        }

        return sackValue;
    }
}
