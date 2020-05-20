package com.sean.mashibin.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVarargs {

    @SafeVarargs
    public static <T> List<T> makeList(T... args) {
        return new ArrayList<T>(Arrays.asList(args));
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
