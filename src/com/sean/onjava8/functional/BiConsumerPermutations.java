package com.sean.onjava8.functional;

import java.util.function.BiConsumer;

/**
 * @author: Shaun
 * @create: 2020-05-07 15:11
 * @description: TODO
 */
public class BiConsumerPermutations {
    static BiConsumer<Integer, Double> bicid = (i,d) -> {
        System.out.format("%d, %f%n",i,d);
    };
    static BiConsumer<Double, Integer> bicdi = (d,i) -> {
        System.out.format("%d, %f%n",i,d);
    };
    static BiConsumer<Integer,Long> bicil = (i,l) -> {
        System.out.format("%d, %d%n",i,l);
    };

    public static void main(String[] args) {
        bicid.accept(47,11.34);
        bicdi.accept(3.145,52);
        bicil.accept(11,152L);
    }
}
