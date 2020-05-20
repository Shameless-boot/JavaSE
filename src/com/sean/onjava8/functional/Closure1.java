package com.sean.onjava8.functional;

import java.util.function.IntSupplier;

/**
 * @author: Shaun
 * @create: 2020-05-07 15:48
 * @description: TODO
 */
public class Closure1 {
    int i;

    IntSupplier makeFun(int x) {

        return () -> x + i++;
    }
}
