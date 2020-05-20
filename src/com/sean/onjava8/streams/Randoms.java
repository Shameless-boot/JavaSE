package com.sean.onjava8.streams;

import java.util.Random;

/**
 * @author: Shaun
 * @create: 2020-05-10 14:46
 * @description: TODO
 */
public class Randoms {
    public static void main(String[] args) {
        new Random()
                .ints(5,20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);

    }
}
