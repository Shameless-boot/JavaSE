package com.sean.mashibin.generic;

import java.util.Comparator;
import java.util.List;

public class MyCompareTo implements Comparator<Integer> {
    @Override
    public int compare(Integer t1, Integer t2) {
        return t1.compareTo(t2);
    }

}

class BridgeMethod {
    public <T> T max(List<T> list, Comparator<T> comp) {
        T max = list.get(0);
        for (T t : list)
            if (comp.compare(t,max) > 0)
                max = t;

        return max;
    }
}
