package com.sean.onjava8.streams;

import java.util.stream.Stream;

/**
 * @author: Shaun
 * @create: 2020-05-10 16:33
 * @description: TODO
 */
public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);
    }
}
