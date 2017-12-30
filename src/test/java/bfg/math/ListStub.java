package bfg.math;

import java.util.ArrayList;
import java.util.List;

public class ListStub extends ArrayList {

    public static <T> List<T> create(T... elements) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) list.add(elements[i]);

        return list;
    }
}
