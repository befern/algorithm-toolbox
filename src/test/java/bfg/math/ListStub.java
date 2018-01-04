package bfg.math;

import java.util.ArrayList;
import java.util.List;

public class ListStub extends ArrayList {

    public static <T> List<T> create(T... elements) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) list.add(elements[i]);

        return list;
    }

    public static List<Integer> createIntegerListfromIntArray(int[] intArray){
        List<Integer> integerList = new ArrayList<Integer>();

        for (int index = 0; index < intArray.length; index++) {
            integerList.add(intArray[index]);
        }

        return integerList;
    }
}
