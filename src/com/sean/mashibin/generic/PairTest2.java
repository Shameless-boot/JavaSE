package com.sean.mashibin.generic;

import java.time.LocalDate;

public class PairTest2<T>{
    T[] t;
    Pair<String> pair;
    public static void main(String[] args) {
        LocalDate dates[] = {
                LocalDate.of(1993, 8, 12),
                LocalDate.of(1998, 10, 1),
                LocalDate.of(1999, 12, 22),
                LocalDate.of(1995, 6, 30)
        };
        Pair<LocalDate> mm = ArrayAlg2.minmax(dates);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        PairTest2<String> s = new PairTest2<>();
        s.fun(new String[]{"11","22"});
        System.out.println(s.t);

    }
    void fun(T[] a) {
        t = a;
    }
}

class ArrayAlg2 {
    /**
     * Get the minimum and maximum of an array of objects of type T
     * @param ts an array of objects of type T
     * @param <T>
     * @return a pair with min and max value,or null if ts is null or empty
     */
    public static <T extends Comparable> Pair<T> minmax(T... ts) {
        T min = ts[0], max = ts[0];
        for (T t : ts) {
            if (min.compareTo(t) > 0)
                min = t;
            if (max.compareTo(t) < 0)
                max = t;
        }
        return new Pair<>(min,max);
    }
}
