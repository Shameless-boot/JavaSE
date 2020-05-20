package com.sean.onjava8.functional;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * @author: Shaun
 * @create: 2020-05-07 15:48
 * @description: TODO
 */
public class Closure3 {
    Supplier<List<Integer>> makeFun() {
        final List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {
        Closure3 c3 = new Closure3();
        List<Integer> l1 = c3.makeFun().get(),
                l2 = c3.makeFun().get();

        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}
