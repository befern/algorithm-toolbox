package com.math.search;

import java.util.Random;

public class Sorting {
    private static Random random = new Random();

    public static void randomizedQuickSort(int[] array, int left, int right) {
        if (left >= right) return;

        int pivot = random.nextInt(right - left + 1) + left;
        swap(array, left, pivot);

        int[] m = partition3(array, left, right);
        randomizedQuickSort(array, left, m[0] - 1);
        randomizedQuickSort(array, m[1] + 1, right);
    }

    private static int[] partition3(int[] array, int left, int right) {
        int pivot = array[left];
        int lowerBound = left, greaterBound = left;

        for (int i = left + 1; i <= right; i++) {
            if (array[i] < pivot) {
                swap(array, i, lowerBound + 1);
                lowerBound++;
                greaterBound++;
            } else if (array[i] == pivot) {
                swap(array, i, greaterBound + 1);
                greaterBound++;
            }
        }

        swap(array, left, lowerBound);

        return new int[] {lowerBound, greaterBound};
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
