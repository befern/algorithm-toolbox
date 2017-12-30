package bfg.math;

import java.util.Arrays;

public class IntegerArrayStub{

    public static int[] createMonotoneIncreasingArray(int start, int maxEnd, PositiveInteger step) {
        return createArray(start, maxEnd, step.getValue());
    }

    public static int[] createMonotoneDecreasingArray(int start, int maxEnd, PositiveInteger step) {
        return createArray(start, maxEnd, -step.getValue());
    }

    public static int[] createEqualElementsArray(int integer, PositiveInteger length) {
        int[] monotoneArray = new int[length.getValue()];

        Arrays.fill(monotoneArray, integer);

        return monotoneArray;
    }

    private static int[] createArray(int start, int maxEnd, int step){
        int[] resultArray = new int[(maxEnd - start) / step + 1];

        for (int i = 0; i < resultArray.length; i++)
            resultArray[i] = i * step + start;

        return resultArray;
    }
}
