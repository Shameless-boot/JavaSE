package com.sean.onjava8.functional;

/**
 * @author: Shaun
 * @create: 2020-05-07 14:54
 * @description: TODO
 */

public class TriFunctionTest {
    static int f(int i, long l, double d) {
        return 99;
    }

    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> tri =
                TriFunctionTest::f;
        System.out.println(tri.apply(1, 1L,10.5));

        tri = (i,l,d) -> 99;

        System.out.println(tri.apply(1, 2L,10.5));
    }
}
