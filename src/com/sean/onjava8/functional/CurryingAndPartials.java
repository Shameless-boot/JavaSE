package com.sean.onjava8.functional;

import java.util.function.Function;

/**
 * @author: Shaun
 * @create: 2020-05-10 14:27
 * @description: TODO
 */
public class CurryingAndPartials {
    static String uncurried(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function<String, Function<String,String>> sum =
                a -> b -> a + b;

        System.out.println(uncurried("Hi ", "Ho"));

        Function<String, String> h1 = sum.apply("Hi ");
        System.out.println(h1.apply("Ho"));

        Function<String, String> sumHi = sum.apply("Hup ");
        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));
    }
}
