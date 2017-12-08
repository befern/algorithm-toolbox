package com.math.search;

public class MajorityElement {


    public static boolean hasMajorityElement(int[] votes){
        return getMajorityElement(votes, 0, votes.length - 1) == - 1 ? false : true;
    }

    private static int getMajorityElement(int[] votes, int low, int high) {
        if (low == high) return votes[low];

        int middle = (high - low) / 2 + low;
        int left_majority  = getMajorityElement(votes, low, middle);
        int right_majority = getMajorityElement(votes, middle + 1, high);

        if (left_majority == right_majority) return left_majority;

        int left_count  = getFrequency(votes, left_majority);
        int right_count = getFrequency(votes, right_majority);

        return left_count > votes.length / 2 ? left_majority : ( right_count > votes.length / 2 ? right_majority : -1 );
    }

    private static int getFrequency(int[] a, int major) {
        int count = 0;

        for (int ele : a) {
            if (ele == major) count++;
            if (count > a.length / 2) break;
        }

        return count;
    }
}
