package com.sean.mashibin.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnSafeVarargs
{
    @SafeVarargs // Not actually safe!
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        array[0] = Arrays.asList(42); // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
    }

    public static void main(String[] args) {
        m(Arrays.asList("A", "B", "C"));
    }
}
