package bfg.math.greedy_algorithms;

import java.util.*;

public final class GreedyMath {

    private GreedyMath() {
    }

    public static int extractBiggestValue(int balance, int[] subtractors) {
        Arrays.sort(subtractors);

        for (int i = subtractors.length; i > 0; i--)
            while (balance >= subtractors[i - 1]) return balance - subtractors[i - 1];
        return balance;
    }

    public static TreeMap<Double, Integer> itemsForDensityMap(int[] values, int[] weights) {
        TreeMap<Double, Integer> amountsOfDensityValues = new TreeMap<Double, Integer>((Collections.reverseOrder()));

        for (int i = 0; i < values.length; i++) {
            double itemDensity;

            if (weights[i] == 0) itemDensity = Integer.MAX_VALUE;
            else itemDensity = (double) values[i] / weights[i];

            if (amountsOfDensityValues.get(itemDensity) == null)
                amountsOfDensityValues.put(itemDensity, weights[i]);
            else
                amountsOfDensityValues.put(itemDensity, amountsOfDensityValues.get(itemDensity) + weights[i]);
        }

        return amountsOfDensityValues;
    }

    public static long maxDotProduct(int[] listA, int[] listB) {
        Arrays.sort(listA);
        Arrays.sort(listB);
        long sumProduct = 0;

        for (int i = 0; i < listA.length; i++) {
            sumProduct += listA[i] * listB[i];
        }
        return sumProduct;
    }

    public static List<Integer> maximizeDifferentSummands(int wholeNumber) {
        int quantityLeft = wholeNumber;
        int currentSummand = wholeNumber != 2 ? 1 : 2;
        List<Integer> summands = new ArrayList<>();

        while (quantityLeft > 0) {
            if (quantityLeft < currentSummand * 2) currentSummand = quantityLeft;
            summands.add(currentSummand);
            quantityLeft -= currentSummand;
            currentSummand += 1;
        }

        return summands;
    }

    public static String largestNumberCreator(String[] digits) {
        ArrayList<String> digitList = new ArrayList<>(Arrays.asList(digits));
        String head = "";
        String greaterNumber;

        while (!digitList.isEmpty()) {
            greaterNumber = greaterNumber(digitList);
            head += greaterNumber;
            digitList.remove(greaterNumber);
        }

        return head;
    }

    private static String greaterNumber(List<String> numbers) {
        if (numbers.size() == 1) return numbers.get(0);
        else return numbers.stream().reduce((a, b) -> Integer.parseInt(a + b) > Integer.parseInt(b + a) ? a : b).get();
    }
}
