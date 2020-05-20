package com.sean.onjava8.functional;

import java.util.function.Function;

/**
 * @author: Shaun
 * @create: 2020-05-10 14:32
 * @description: TODO
 */
public class Curry3Args {
    public static void main(String[] args) {
        Function<String,
                Function<String,
                        Function<String,String>>> sum =
                a -> b -> c -> a + b + c;

        Function<String, Function<String, String>> hi
                = sum.apply("Hi ");

        Function<String,String> ho = hi.apply("Ho ");
        System.out.println(ho.apply("Hup"));
    }
}
