package com.sean.onjava8.functional;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * @author: Shaun
 * @create: 2020-05-10 14:39
 * @description: TODO
 */
public class CurriedIntAdd {
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;

        IntUnaryOperator add4 = curriedIntAdd.apply(4);
        System.out.println(add4.applyAsInt(5));
    }
}
