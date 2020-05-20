package com.sean.onjava8.streams;

import java.util.stream.Stream;

/**
 * @author: Shaun
 * @create: 2020-05-10 14:56
 * @description: Create Stream Object
 */
public class StreamOf {
    public static void main(String[] args) {
        Stream.of(new Bubble(1), new Bubble(2), new Bubble(3))
                .forEach(System.out::println);

        Stream.of("It's ","a ","wonderful ","day ","for ","pie!")
                .forEach(System.out::print);

        System.out.println();

        Stream.of(3.1456,2.4,2.4878)
                .forEach(System.out::println);
    }
}
